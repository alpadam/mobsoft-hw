package hu.bme.aut.mobsoft.lab.mobszofthomework;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.UIModule;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainActivity;

@Singleton
@Component(modules = {UIModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);
}
