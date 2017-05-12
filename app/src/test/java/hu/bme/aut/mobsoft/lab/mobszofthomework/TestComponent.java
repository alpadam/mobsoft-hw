package hu.bme.aut.mobsoft.lab.mobszofthomework;


import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.InteractorModule;
import hu.bme.aut.mobsoft.lab.mobszofthomework.mock.MockNetworkModule;

@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class, InteractorModule.class, TestRepositoryModule.class})
public interface TestComponent extends MobSoftApplicationComponent {



}
