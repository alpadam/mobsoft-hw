package hu.bme.aut.mobsoft.lab.mobszofthomework.repository;


import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

public class MemoryRepository implements Repository {

    private static final long MINUTE = 60 * 1000;

    public static List<FuelRecord> records;

    @Override
    public void open(Context context) {
        FuelRecord record1 = new FuelRecord(1L, 356.9, 7688, true, 122345);
        FuelRecord record2 = new FuelRecord(3L, 358.9, 6488, false, 122345);

        records = new ArrayList<>();
        records.add(record1);
        records.add(record1);
    }

    @Override
    public void close() {
    }

    @Override
    public List<FuelRecord> getFuelRecords() {
        return records;
    }

    @Override
    public void saveRecord(FuelRecord record) {
        records.add(record);
    }

    @Override
    public void updateRecord(List<FuelRecord> records) {
        for (int i = 0; i < this.records.size(); i++) {
            FuelRecord record = this.records.get(i);
            for (FuelRecord r : records) {
                if (r.getId().equals(record.getId())) {
                    this.records.set(i, r);
                }
            }
        }
    }

    @Override
    public void removeRecord(FuelRecord record) {
        records.remove(record);
    }

    @Override
    public boolean isInDB(FuelRecord record) {
        return records.contains(record);
    }
}
