package ru_rtk_java.attestation01;

import java.util.ArrayList;

public class Person {
    private String name;
    private double money;
//    private String product;

        public Person (String name, double money) {
            this.name = name;
            this.money = money;
//            this.product = product;

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            if (name.length()>3) {
                this.name = name;
            } else {
                System.out.println("Ошибка! Имя не может быть короче 3 символов!");
            }

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
            if (money >= 0) {
                this.money = money;
            } else {
                System.out.println("Ошибка! Деньги не могут быть отрицательными!");
            }
    }
//    public ArrayList<Product> getProducts()
//    {
//        return products;
//    }

//    public String getProduct() {
//
//        return product;
//    }
//
//    public void setProduct(String product) {
//        this.product = product;
//    }

    @Override
    public String toString() {
        return "\n" + name + ": " + money + " рублей"/*+ product*/;}
}
