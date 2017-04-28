package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.statistics;


import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.Presenter;

public class StatisticsPresenter extends Presenter<StatisticsScreen> {

    @Inject
    FuelRecordInteractor fuelRecordInteractor;

    @Override
    public void attachScreen(StatisticsScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}

