package ru_rtk_java.homework7;

public class DiscountProduct extends Product {
    private  Discount discount;
//    private float size; // размер скидки
//    private int happyHour; // Счастливые часы: часы, сколько действует скидка
    public DiscountProduct(String item, float price, Discount discount) {
        super(item, price);
//        if (size < 0) throw new IllegalArgumentException("Скидка на продукт не может быть отрицательным числом!");
//        if (size >= 100) throw new IllegalArgumentException("Скидка на продукт не может составлять всю его стоимость или больше!");
        this.discount = discount;
//        this.happyHour = happyHour;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "DiscountProduct{" +
                "discount=" + discount +
                '}';
    }
}


    //    public DiscountProduct getDiscountProduct(){
//
//    }
//    @Override
//    public float getPrice() {
//    return getPrice()*(1-getSize()/100);




