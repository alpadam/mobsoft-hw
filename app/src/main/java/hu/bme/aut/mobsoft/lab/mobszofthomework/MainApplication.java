package hu.bme.aut.mobsoft.lab.mobszofthomework;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import io.fabric.sdk.android.Fabric;
import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.repository.Repository;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.UIModule;

public class MainApplication extends Application {

    @Inject
    Repository repository;

    private static GoogleAnalytics sAnalytics;
    private static Tracker sTracker;

    public static MobSoftApplicationComponent injector;

    public void setInjector(MobSoftApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
        repository.open(getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();

        sAnalytics = GoogleAnalytics.getInstance(this);
        Fabric.with(this, new Crashlytics());

        injector = DaggerMobSoftApplicationComponent.builder().uIModule(new UIModule(this)).build();

        injector.inject(this);
        repository.open(getApplicationContext());
    }

    synchronized public Tracker getDefaultTracker() {
        // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
        if (sTracker == null) {
            sTracker = sAnalytics.newTracker(R.xml.global_tracker);
        }

        return sTracker;
    }
}
