package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.login;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events.LoginEvent;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.Presenter;

import static hu.bme.aut.mobsoft.lab.mobszofthomework.MainApplication.injector;

public class LoginPresenter extends Presenter<LoginScreen> {

    @Inject
    FuelRecordInteractor fuelRecordInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    @Override
    public void attachScreen(LoginScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }

    public void login(final String user, final String pw){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                fuelRecordInteractor.login(user, pw);
            }
        });
    }

    public void onEventMainThread(LoginEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showMessage("error");
            }
        } else {
            System.out.println(event.isSuccess());
        }
    }
}
