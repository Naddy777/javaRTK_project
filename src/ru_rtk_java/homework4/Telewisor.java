package ru_rtk_java.homework4;

public class Telewisor {
    private String model;// Название, модель
    private int refreshRate;//Частота обновления: 60, 120
    private String smartTV; //Наличие смарт ТВ
    private int price;// цена телевизора


        public Telewisor (String model, int refreshRate, String smartTV, int price){
        this.model = model;
        this.price = price;
        this.refreshRate = refreshRate;
        this.smartTV = smartTV;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(String smartTV) {
        this.smartTV = smartTV;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    public void SetTV(){

        System.out.println("Вы создали телевизор: модель - " + model + ", частота обновления - " + refreshRate + ", функция smart - " + smartTV + ", цена = " + price);
    }
}
