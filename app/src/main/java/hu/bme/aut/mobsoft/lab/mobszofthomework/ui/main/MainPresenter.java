package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.Presenter;

public class MainPresenter extends Presenter<MainScreen> {

    @Inject
    FuelRecordInteractor fuelRecordInteractor;

    public MainPresenter() {
    }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}