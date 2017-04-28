package hu.bme.aut.mobsoft.lab.mobszofthomework;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.InteractorModule;
import hu.bme.aut.mobsoft.lab.mobszofthomework.repository.RepositoryModule;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.UIModule;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.add.AddActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.add.AddPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.detail.DetailActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.detail.DetailPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage.ListPageActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage.ListPagePresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.login.LoginActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.login.LoginPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.statistics.StatisticsActivity;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.statistics.StatisticsPresenter;

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

    void inject(MainPresenter mainPresenter);
    void inject(LoginPresenter loginPresenter);
    void inject(StatisticsPresenter statisticsPresenter);
    void inject(ListPagePresenter listPagePresenter);
    void inject(DetailPresenter detailPresenter);
    void inject(AddPresenter addPresenter);
}
