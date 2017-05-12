package hu.bme.aut.mobsoft.lab.mobszofthomework;

import javax.inject.Singleton;

import android.content.Context;

import java.util.concurrent.Executor;

import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.EventBus;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.add.AddPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.detail.DetailPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage.ListPagePresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.login.LoginPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.UIModule;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.statistics.StatisticsPresenter;

@Module
public class TestModule {

    private final UIModule UIModule;

    public TestModule(Context context) {
        this.UIModule = new UIModule(context);
    }

    @Provides
    public Context provideContext() {
        return UIModule.provideContext();
    }


    @Provides
    public MainPresenter provideMainPresenter() {
        return UIModule.provideMainPresenter();
    }


    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return EventBus.getDefault();
    }

    @Provides
    @Singleton
    public Executor provideNetworkExecutor() {
        return new UIExecutor();
    }


    @Provides
    @Singleton
    public AddPresenter provideAddPresenter() {
        return UIModule.provideAddPresenter();
    }

    @Provides
    @Singleton
    public DetailPresenter provideDetailPresenter() {
        return UIModule.provideDetailPresenter();
    }

    @Provides
    @Singleton
    public LoginPresenter provideLoginPresenter() {
        return UIModule.provideLoginPresenter();
    }

    @Provides
    @Singleton
    public ListPagePresenter provideListPagePresenter() {
        return UIModule.provideListPagePresenter();
    }

    @Provides
    @Singleton
    public StatisticsPresenter provideStatisticsPresenter() {
        return UIModule.provideStatisticsPresenter();
    }

}
