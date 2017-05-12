package hu.bme.aut.mobsoft.lab.mobszofthomework;


import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;

public class TestHelper {

    public static void setTestInjector() {
        ShadowLog.stream = System.out;
        MainApplication application = (MainApplication) RuntimeEnvironment.application;
        MobSoftApplicationComponent injector = DaggerTestComponent.builder().testModule(new TestModule(application.getApplicationContext())).build();
        application.setInjector(injector);
    }
}