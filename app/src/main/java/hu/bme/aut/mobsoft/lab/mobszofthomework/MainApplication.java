package hu.bme.aut.mobsoft.lab.mobszofthomework;

import android.app.Application;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.repository.Repository;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.UIModule;

public class MainApplication extends Application {

    @Inject
    Repository repository;

    public static MobSoftApplicationComponent injector;

    public void setInjector(MobSoftApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
        repository.open(getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();

        injector = DaggerMobSoftApplicationComponent.builder().uIModule(new UIModule(this)).build();

        injector.inject(this);
        repository.open(getApplicationContext());
    }
}
