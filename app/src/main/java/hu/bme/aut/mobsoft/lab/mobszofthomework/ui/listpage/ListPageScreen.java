package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage;

import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

public interface ListPageScreen {
    void showMessage(String text);
    void showRecordList(List<FuelRecord> records);
}
