package ru_rtk_java.attestation01;

public class Product {
    private String item;
    private float price;

    public Product(String item, float price) {
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
//    @Override
//    public String toString() {
//        return "\n" + "Цена продукта " + item + " составляет: " + price + " рублей";
//        }

    @Override
    public String toString() {
                 return item;

    }

}
