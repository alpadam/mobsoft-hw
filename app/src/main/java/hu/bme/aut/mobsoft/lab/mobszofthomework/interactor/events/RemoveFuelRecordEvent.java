package hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events;


import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

public class RemoveFuelRecordEvent {
    private int code;
    private FuelRecord record;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public RemoveFuelRecordEvent() {
    }

    public RemoveFuelRecordEvent(int code, FuelRecord record, Throwable throwable) {
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

    public void setRecord(FuelRecord record) {
        this.record = record;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
