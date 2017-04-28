package hu.bme.aut.mobsoft.lab.mobszofthomework.interactor;

import dagger.Module;
import dagger.Provides;


@Module
public class InteractorModule {
    @Provides
    public FuelRecordInteractor provideRecipes() {
        return new FuelRecordInteractor();
    }
}
