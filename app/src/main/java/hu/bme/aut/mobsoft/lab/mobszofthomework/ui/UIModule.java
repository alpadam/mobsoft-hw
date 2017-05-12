package hu.bme.aut.mobsoft.lab.mobszofthomework.ui;

import javax.inject.Singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import de.greenrobot.event.EventBus;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.add.AddPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.detail.DetailPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage.ListPagePresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.login.LoginPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.statistics.StatisticsPresenter;


import android.content.Context;

@Module
public class UIModule {

    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public AddPresenter provideAddPresenter() {
        return new AddPresenter();
    }

    @Provides
    @Singleton
    public DetailPresenter provideDetailPresenter() {
        return new DetailPresenter();
    }

    @Provides
    @Singleton
    public LoginPresenter provideLoginPresenter() {
        return new LoginPresenter();
    }

    @Provides
    @Singleton
    public ListPagePresenter provideListPagePresenter() {
        return new ListPagePresenter();
    }

    @Provides
    @Singleton
    public StatisticsPresenter provideStatisticsPresenter() {
        return new StatisticsPresenter();
    }


    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return EventBus.getDefault();
    }

    @Provides
    @Singleton
    public Executor provideExecutor() {
        return Executors.newFixedThreadPool(1);
    }
}
