package hu.bme.aut.mobsoft.lab.mobszofthomework;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.mobsoft.lab.mobszofthomework.repository.MemoryRepository;
import hu.bme.aut.mobsoft.lab.mobszofthomework.repository.Repository;

@Module
public class TestRepositoryModule {

    @Singleton
    @Provides
    public Repository provideRepository() {
        return new MemoryRepository();
    }
}