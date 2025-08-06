package ru_rtk_java.attestation01;
import java.util.ArrayList;
public class Person {
    private String name;
    private float money;
    private ArrayList<Product> products = new ArrayList<>();

    public Person(String name, float money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 3) {
            this.name = name;
        } else {
            System.out.println("Ошибка! Имя не может быть короче 3 символов!");
        }
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        if (money >= 0) {
            this.money = money;
        } else {
            System.out.println("Ошибка! Деньги не могут быть отрицательными!");
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public String toString() {
            return "\n" + name + " - " + products;
    }
}
