package hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events;


import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

public class GetFuelRecordsEvent {

    private int code;
    private List<FuelRecord> records;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public GetFuelRecordsEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<FuelRecord> getRecords() {
        return records;
    }

    public void setRecords(List<FuelRecord> records) {
        this.records = records;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    //</editor-fold>
}