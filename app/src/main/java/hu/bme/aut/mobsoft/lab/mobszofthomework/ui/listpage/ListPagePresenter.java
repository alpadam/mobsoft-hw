package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage;

import android.util.Log;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events.GetFuelRecordsEvent;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events.SaveFuelRecordEvent;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.Presenter;

import static hu.bme.aut.mobsoft.lab.mobszofthomework.MainApplication.injector;

public class ListPagePresenter extends Presenter<ListPageScreen> {

    @Inject
    FuelRecordInteractor fuelRecordInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    @Override
    public void attachScreen(ListPageScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }

    public void onEventMainThread(GetFuelRecordsEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showMessage("error");
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if (screen != null) {
                screen.showRecordList(event.getRecords());
            }
        }
    }

    public void getFuelRecords() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                fuelRecordInteractor.getRecords();
            }
        });
    }
}
