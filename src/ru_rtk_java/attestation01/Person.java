package ru_rtk_java.attestation01;

public class Person {
    private String name;
    private float money;
    private String product;
    private boolean sostoyanie;
        public Person (String name, float money, String product) {
            this.name = name;
            this.money = money;
            this.product = product;
            this.sostoyanie = true;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    @Override
    public String toString() {
        return "\n" + "Имя покупателя: " + name + ", сумма денег в кошельке: " + money + ", пакет продуктов: " + product + ", платежеспособность: " + (sostoyanie ? " платежеспособен" : " неплатежеспособен ") ;
    }
}
