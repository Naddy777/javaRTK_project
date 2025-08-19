package ru_rtk_java.homework7;

import java.time.LocalDateTime;

public class Discount {
    private float size;// размер скидки
    private int happyHour; // Счастливые часы: час, до которого действует скидка

    public Discount(float size, int happyHour) {

        if (size < 0) throw new IllegalArgumentException("Скидка на продукт не может быть отрицательным числом!");
        if (size > 100) throw new IllegalArgumentException("Скидка на продукт не может составлять всю его стоимость!");
        this.size = size;
        this.happyHour = happyHour;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getHappyHour() {
        return happyHour;
    }

    public void setHappyHour(int hour) {
        this.happyHour = hour;
    }

    public boolean happyHour() {
        int hourNow = LocalDateTime.now().getHour();
        boolean sostoyanie;
        if(hourNow < this.happyHour){
            sostoyanie = true;
            System.out.println(" - Вы пользуетесь скидкой 'Счастливый час'!");
        }else{
            sostoyanie = false;
            System.out.println(" - Скидки счастливого часа закончились!");
        }
        return sostoyanie;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "size=" + size +
                ", hour=" + happyHour +
                '}';
    }
}
