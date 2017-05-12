package hu.bme.aut.mobsoft.lab.mobszofthomework.model;

import com.google.gson.annotations.SerializedName;
import com.orm.dsl.Table;

@Table
public class FuelRecord {

    @SerializedName("id")
    private Long id = null;

    @SerializedName("amount")
    private Double amount = null;

    @SerializedName("isFullTank")
    private Boolean isFullTank = null;

    @SerializedName("mileage")
    private Integer mileage = null;

    @SerializedName("userid")
    private Long userid = null;

    private double price;



    public FuelRecord() {}

    public FuelRecord(Long id, double price, double amount, boolean isFulltank, int mileage, Long userid) {
        this.id = id;
        this.price = price;
        this.amount = amount;
        this.isFullTank = isFulltank;
        this.mileage = mileage;
        this.userid = userid;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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
