package web;

public class Car {
    private String brand_name;
    private String model;
    private int year;

    public Car(String brand_name, String model, int year) {
        this.brand_name = brand_name;
        this.model = model;
        this.year = year;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
