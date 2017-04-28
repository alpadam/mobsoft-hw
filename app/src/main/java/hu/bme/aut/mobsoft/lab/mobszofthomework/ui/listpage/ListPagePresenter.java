package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.Presenter;

public class ListPagePresenter extends Presenter<ListPageScreen> {

    @Inject
    FuelRecordInteractor fuelRecordInteractor;

    @Override
    public void attachScreen(ListPageScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
