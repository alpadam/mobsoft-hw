package hu.bme.aut.mobsoft.lab.mobszofthomework.model;

import com.orm.dsl.Table;

import static android.R.attr.name;

@Table
public class FuelRecord {

    private Long id = null;
    private double price;
    private int amount;
    private boolean isFullTank;
    private int mileage;

    public FuelRecord(Long id, double price, int amount, boolean isFulltank, int mileage) {
        this.id = id;
        this.price = price;
        this.amount = amount;
        this.isFullTank = isFulltank;
        this.mileage = mileage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isFulltank() {
        return isFullTank;
    }

    public void setFulltank(boolean fulltank) {
        isFullTank = fulltank;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
