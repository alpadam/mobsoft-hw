package hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events;


import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

import static hu.bme.aut.mobsoft.lab.mobszofthomework.repository.MemoryRepository.records;

public class SaveFuelRecordEvent {
    private int code;
    private FuelRecord record;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public SaveFuelRecordEvent() {}

    public SaveFuelRecordEvent(int code, FuelRecord record, Throwable throwable) {
        this.code = code;
        this.record = record;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public FuelRecord getRecord() {
        return record;
    }

    public void setRecords(FuelRecord record) {
        this.record = record;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    //</editor-fold>
}



