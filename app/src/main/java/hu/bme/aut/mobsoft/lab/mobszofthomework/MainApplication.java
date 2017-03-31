package hu.bme.aut.mobsoft.lab.mobszofthomework;

import android.app.Application;

import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.UIModule;

public class MainApplication extends Application {

    public static MobSoftApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerMobSoftApplicationComponent.builder().uIModule( new UIModule(this)).build();
    }
}
