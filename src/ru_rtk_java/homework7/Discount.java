package ru_rtk_java.homework7;

import java.time.LocalDateTime;

public class Discount {
    private float size;// размер скидки
    private int happyHour; // Счастливые часы: сколько часов действует скидка
    private int startHour; // с какого часа действует скидка
    public Discount(float size, int startHour, int happyHour) {

        if (size < 0) throw new IllegalArgumentException("Скидка на продукт не может быть отрицательным числом! Черная пятница включена не будет. ");
        if (size >= 100) throw new IllegalArgumentException("Скидка на продукт не может составлять всю его стоимость! Черная пятница включена не будет. ");
        this.size = size;
        if (startHour > 24|| startHour < 0) throw new IllegalArgumentException("Вы вышли за пределы суток! Такого часа не существует. Черная пятница включена не будет. ");
        this.startHour = startHour;
        this.happyHour = happyHour;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
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

    public boolean runDiscount() {
        int hourNow = LocalDateTime.now().getHour();
        boolean sostoyanie;
        if(hourNow >= this.startHour && hourNow <= (this.startHour + this.happyHour - 1)){
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
                ", happyHour=" + happyHour +
                ", startHour=" + startHour +
                '}';
    }
}
