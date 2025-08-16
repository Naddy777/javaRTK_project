package ru_rtk_java.homework6;

import java.util.ArrayList;
public class Person {
    private String name;
    private float money;
    private ArrayList<Product> products;

    public Person(String name, float money) {
        if (name.length() < 3 || name.isEmpty()) throw new IllegalArgumentException("Имя не может быть пустым или коротким! Данные по покупателю " + name + " не занесены!");
        if (money < 0) throw new IllegalArgumentException("Деньги не могут быть отрицательным числом! Данные по покупателю " + name + " не занесены!");
        this.name = name;
        this.money = money;
        this.products = new ArrayList<>();
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

    public boolean buyProduct (Product product){
        if (product.getPrice() <= this.money){
            this.products.add(product);
            this.money -= product.getPrice();
            System.out.println(this.name + " купил(а) " + product.getItem());
            return true;
        }else {
            System.out.println(this.name + " не может позволить себе " + product.getItem());
            return false;
        }
    }

//    @Override
//    public String toString() {
//            return "\n" + name + " - " + products;
//    }


    @Override// Другая версия метода вывода корзины на печать
    public String toString() {
        String result = this.name + ": ";
        if(!products.isEmpty()){
            for(Product p : products){
                result +=p.getItem() + ", ";
            }
            result = result.substring(0,result.length()-2);// Удаляем последнюю запятую. substring - возвращает нов.строку с индекса 0 по длину result минус 2 символа с конца
        }else {
            result += "Ничего не куплено";
        }

        return result;
    }
}
