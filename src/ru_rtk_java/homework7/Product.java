package ru_rtk_java.homework7;

public class Product {
    private String item;
    private float price;

    public Product(String item, float price) {
        if (item.length() < 1 || item.isEmpty()) throw new IllegalArgumentException("Название продукта не может быть пустым или 1 символ! Данные по продукту " + item + " не занесены!");
        if (price < 0) throw new IllegalArgumentException("Цена продукта не может быть отрицательным числом! Данные по продукту " + item + " не занесены!");
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        if (item.length() > 1) {
            this.item = item;
        } else {
            System.out.println("Ошибка! Название продукта не может быть 1 символ!");
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Ошибка! Деньги не могут быть отрицательными!");
        }
    }

    @Override
    public String toString() {
        return item;
    }

}
