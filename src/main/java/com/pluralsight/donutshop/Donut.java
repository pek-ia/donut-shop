package com.pluralsight.donutshop;

public class Donut {
    // Instance variables
    private String doughFlavor;
    private String fillingFlavor;
    private boolean isFrosted = false;
    private boolean isFilled = false;
    private int calories;
    private double price;


    // Constructor
    // Initializes the instance variables
    public Donut(String doughFlavor, String fillingFlavor, boolean isFrosted, boolean isFilled, int calories, double price) {
        this.doughFlavor = doughFlavor;
        this.fillingFlavor = fillingFlavor;
        this.isFrosted = isFrosted;
        this.isFilled = isFilled;
        this.calories = calories;
        this.price = price;
    }

    public Donut(){
        this("Vanilla", "None", false, false, 190, .29);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDoughFlavor() {
        return doughFlavor;
    }

    public String getFillingFlavor() {
        return fillingFlavor;
    }

    public boolean isFrosted() {
        return isFrosted;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Donut{");
        sb.append("doughFlavor='").append(doughFlavor).append('\'');
        sb.append(", fillingFlavor='").append(fillingFlavor).append('\'');
        sb.append(", isFrosted=").append(isFrosted);
        sb.append(", isFilled=").append(isFilled);
        sb.append(", calories=").append(calories);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
