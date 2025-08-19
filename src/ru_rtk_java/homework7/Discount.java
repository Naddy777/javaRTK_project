package ru_rtk_java.homework7;

public class Discount {
    private float size;// размер скидки
    private int hour; // Счастливые часы: час, до которого действует скидка

    public Discount(float size, int hour) {

        if (size < 0) throw new IllegalArgumentException("Скидка на продукт не может быть отрицательным числом!");
        if (size > 100) throw new IllegalArgumentException("Скидка на продукт не может составлять всю его стоимость!");
        this.size = size;
        this.hour = hour;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "size=" + size +
                ", hour=" + hour +
                '}';
    }
}
