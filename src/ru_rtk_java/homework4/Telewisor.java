package ru_rtk_java.homework4;

public class Telewisor {
    private String model;// Название, модель
    private int refreshRate;//Частота обновления: 60, 120
    private boolean smartTV; //Наличие смарт ТВ
    private int price;// цена телевизора

    public Telewisor (String model, int refreshRate, boolean smartTV, int price){
        this.model = model;
        this.price = price;
        this.refreshRate = refreshRate;
        this.smartTV = smartTV;
    }

    public Telewisor (){
        this.model = "Не определено";
        this.price = 49_999;
        this.refreshRate = 0;
        this.smartTV = false;
    }

}
