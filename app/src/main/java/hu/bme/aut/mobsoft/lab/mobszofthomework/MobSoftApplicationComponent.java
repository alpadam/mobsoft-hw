package hu.bme.aut.mobsoft.lab.mobszofthomework;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.InteractorModule;
import hu.bme.aut.mobsoft.lab.mobszofthomework.repository.RepositoryModule;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.UIModule;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.add.AddActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.detail.DetailActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage.ListPageActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.login.LoginActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.statistics.StatisticsActivity;

@Singleton
@Component(modules = {UIModule.class, RepositoryModule.class, InteractorModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(AddActivity addActivity);
    void inject(DetailActivity detailActivity);
    void inject(ListPageActivity listActivity);
    void inject(StatisticsActivity statisticsActivity);
    void inject(LoginActivity loginActivity);

    void inject(FuelRecordInteractor fuelRecordInteractor);
    void inject(MainApplication mainApplication);
}
