package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.detail;

import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

public interface DetailScreen {
    void showMessage(String text);
    void showDetail(FuelRecord record);
}
