package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.detail;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.Presenter;

public class DetailPresenter extends Presenter<DetailScreen> {

    @Inject
    FuelRecordInteractor fuelRecordInteractor;

    @Override
    public void attachScreen(DetailScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
