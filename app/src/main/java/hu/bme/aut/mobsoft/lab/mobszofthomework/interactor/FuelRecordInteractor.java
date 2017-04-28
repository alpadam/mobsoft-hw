package hu.bme.aut.mobsoft.lab.mobszofthomework.interactor;


import java.util.List;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.MainApplication;
import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;
import hu.bme.aut.mobsoft.lab.mobszofthomework.repository.Repository;

public class FuelRecordInteractor {

    @Inject
    Repository repository;

    public FuelRecordInteractor() {
        MainApplication.injector.inject(this);
    }

    public void getRecords() {
        List<FuelRecord> records = repository.getFuelRecords();
    }

    public void saveRecord(FuelRecord record) {
        repository.saveRecord(record);
    }

    public void updateRecords(List<FuelRecord> records) {
        try {
            repository.updateRecord(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeRecord(FuelRecord record) {
        repository.removeRecord(record);
    }
}
