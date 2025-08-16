package ru_rtk_java.homework7;

public class DiscountProduct extends Product {
    private int discount;
    public DiscountProduct(String item, float price, int discount) {
        super(item, price);
        if (discount < 0) throw new IllegalArgumentException("Скидка на продукт не может быть отрицательным числом!");
        if (discount > 100) throw new IllegalArgumentException("Скидка на продукт не может составлять всю его стоимость!");
        this.discount = discount;
    }
    public void discountPrice(super.price, discount){

    }
}
