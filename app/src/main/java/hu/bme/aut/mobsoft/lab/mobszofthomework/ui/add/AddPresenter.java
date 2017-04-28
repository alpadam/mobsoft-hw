package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.add;

import android.util.Log;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events.SaveFuelRecordEvent;
import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.Presenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainScreen;

import static hu.bme.aut.mobsoft.lab.mobszofthomework.MainApplication.injector;

public class AddPresenter  extends Presenter<AddScreen> {

    @Inject
    FuelRecordInteractor fuelRecordInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    public AddPresenter() {
    }

    @Override
    public void attachScreen(AddScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }

    public void onEventMainThread(SaveFuelRecordEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showMessage("error");
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if (screen != null) {
                screen.navigateToList();
            }
        }
    }

    public void addFuelRecord() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                // TODO: create FuelRecord
                fuelRecordInteractor.saveRecord(new FuelRecord());
            }
        });
    }
}
