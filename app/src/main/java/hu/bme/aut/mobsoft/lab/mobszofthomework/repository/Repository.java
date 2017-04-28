package hu.bme.aut.mobsoft.lab.mobszofthomework.repository;

import android.content.Context;
import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;


public interface Repository {

    void open(Context context);

    void close();

    List<FuelRecord> getFuelRecords();

    void saveRecord(FuelRecord record);

    void updateRecord(List<FuelRecord> record);

    void removeRecord(FuelRecord record);

    boolean isInDB(FuelRecord todo);


}
