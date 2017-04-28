package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.statistics;

import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

public interface StatisticsScreen {
    void showMessage(String text);
    void showStatistics(List<FuelRecord> records);
}
