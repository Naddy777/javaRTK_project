package ru_rtk_java.homework4;

public class Telewisor {
    private String model;// Название, модель
    private int refreshRate;//Частота обновления: 60, 120
    private String smartTV; //Наличие смарт ТВ
    private int price;// цена телевизора
    private boolean sostoyanie;// состояние: включен или выключен


        public Telewisor (String model, int refreshRate, String smartTV, int price ){
        this.model = model;
        this.price = price;
        this.refreshRate = refreshRate;
        this.smartTV = smartTV;
        this.sostoyanie = false;// изначально телевизор выключен

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

        System.out.println("Вы создали телевизор: модель - " + model + ", частота обновления - " + refreshRate + ", функция smart - " + smartTV + ", цена = " + price +", состояние - " + (sostoyanie ? "включен" : "выключен"));
    }

    public void turnOn() {// метод для изменения состояния на включено
        if (!sostoyanie) {//если не "sostoyanie" (имеется ввиду - если не false)
            sostoyanie = true;
            System.out.println(model + " - вкл ");
        } else {
            System.out.println(model + " - телевизор уже включен.");
        }
        System.out.println("Телевизор: модель - " + model + " включен." );
    }

    public void turnOff() {// метод для изменения состояния на выключено

        if (sostoyanie) {//если "sostoyanie"(имеется ввиду - если false)
            sostoyanie = false;
            System.out.println(model + " - телевизор выключен.");
        } else {
            System.out.println(model + " - телевизор уже выключен.");
        }
        System.out.println("Телевизор: модель - " + model + " выключен." );
    }

    public boolean isTurnOn() {//Получение текущего статуса телека
        return sostoyanie;


    }
    public void Sostoyanie(){

        System.out.println("На текущий момент телевизор " +(sostoyanie ? " включен" : ", выключен")+ " (параметры: модель - " + model + ", частота обновления - " + refreshRate + ", функция smart - " + smartTV + ", цена = " + price + ")");
    }
    @Override
    public String toString() {
        return "\n" + "Модель: " + model + ", частота обновления: " + refreshRate + ", функция smart: " + smartTV + ", цена = " + price +
                ", состояние: " + (sostoyanie ? " прибор включён" : " прибор выключен ") ;
    }

}
