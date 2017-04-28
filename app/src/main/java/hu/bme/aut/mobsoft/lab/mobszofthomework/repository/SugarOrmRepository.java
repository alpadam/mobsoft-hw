package hu.bme.aut.mobsoft.lab.mobszofthomework.repository;


import android.content.Context;

import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

public class SugarOrmRepository implements Repository {

    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public List<FuelRecord> getFuelRecords() {
        return SugarRecord.listAll(FuelRecord.class);
    }

    @Override
    public void saveRecord(FuelRecord record) {
        SugarRecord.saveInTx(record);
    }

    @Override
    public void updateRecord(List<FuelRecord> recordsToadd) {
        List<FuelRecord> records = getFuelRecords();
        List<FuelRecord> toUpdate = new ArrayList<>(records.size());
        for (FuelRecord record : records) {
            for (FuelRecord record2 : recordsToadd) {
                if (record.getId().equals(record2.getId())) {
                    toUpdate.add(record);
                }
            }
        }

        SugarRecord.saveInTx(toUpdate);
    }

    @Override
    public void removeRecord(FuelRecord record) {
        SugarRecord.deleteInTx(record);
    }

    @Override
    public boolean isInDB(FuelRecord record) {
        return SugarRecord.findById(FuelRecord.class, record.getId()) != null;
    }
}