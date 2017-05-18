package hu.bme.aut.mobsoft.lab.mobszofthomework.interactor;




import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import hu.bme.aut.mobsoft.lab.mobszofthomework.MainApplication;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events.GetFuelRecordsEvent;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events.LoginEvent;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events.RemoveFuelRecordEvent;
import hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events.SaveFuelRecordEvent;
import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;
import hu.bme.aut.mobsoft.lab.mobszofthomework.repository.Repository;

import static com.google.common.base.Strings.isNullOrEmpty;

public class FuelRecordInteractor {

    @Inject
    Repository repository;

    @Inject
    EventBus bus;

    public FuelRecordInteractor() {
        MainApplication.injector.inject(this);
    }

    public void getRecords() {
        GetFuelRecordsEvent event = new GetFuelRecordsEvent();
        try {
            List<FuelRecord> records = repository.getFuelRecords();
            event.setRecords(records);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void saveRecord(FuelRecord record) {
        SaveFuelRecordEvent event = new SaveFuelRecordEvent();
        event.setRecords(record);
        try {
            repository.saveRecord(record);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void removeRecord(FuelRecord record) {
        RemoveFuelRecordEvent event = new RemoveFuelRecordEvent();
        event.setRecord(record);
        try {
            repository.removeRecord(record);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void updateRecords(List<FuelRecord> records) {
        try {
            repository.updateRecord(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void login(String name, String password) {
        LoginEvent event = new LoginEvent();
        try {

            if (isNullOrEmpty(name) && isNullOrEmpty(password)) {
                event.setSuccess(false);
            }
            event.setSuccess(true);
            bus.post(event);

        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

}
