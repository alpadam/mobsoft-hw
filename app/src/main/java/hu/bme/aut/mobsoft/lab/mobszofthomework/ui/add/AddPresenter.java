package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.add;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.FuelRecordInteractor;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.Presenter;

public class AddPresenter  extends Presenter<AddScreen> {

    @Inject
    FuelRecordInteractor fuelRecordInteractor;

    public AddPresenter() {
    }

    @Override
    public void attachScreen(AddScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
