package ru_rtk_java.homework11;

public class Cars {
    private String autoId;
    private String model;
    private String color;
    private long probeg;
    private double price;

    public Cars(String autoId, String model, String color, long probeg, double price) {
        this.autoId = autoId;
        this.model = model;
        this.color = color;
        this.probeg = probeg;
        this.price = price;
    }

    public String getAutoId() {
        return autoId;
    }

    public void setAutoId(String autoId) {
        this.autoId = autoId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getProbeg() {
        return probeg;
    }

    public void setProbeg(long probeg) {
        this.probeg = probeg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "[номер авто='" + autoId + '\'' +
                ", модель='" + model + '\'' +
                ", цвет='" + color + '\'' +
                ", пробег=" + probeg +
                ", стоимость=" + price +
                ']' + "\n";
    }
}
