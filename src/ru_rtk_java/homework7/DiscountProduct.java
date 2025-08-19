package ru_rtk_java.homework7;

public class DiscountProduct extends Product {
//    private  Discount discount;
    private float size; // размер скидки
    private int happyHour; // Счастливые часы: час, до которого действует скидка
    public DiscountProduct(String item, float price, float size, int happyHour) {
        super(item, price);
        if (size < 0) throw new IllegalArgumentException("Скидка на продукт не может быть отрицательным числом!");
        if (size >= 100) throw new IllegalArgumentException("Скидка на продукт не может составлять всю его стоимость или больше!");
        this.size = size;
        this.happyHour = happyHour;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getHappyHour() {
        return happyHour;
    }

    public void setHappyHour(int happyHour) {
        this.happyHour = happyHour;
    }

    @Override
    public String toString() {
        return "DiscountProduct{" +
                "size=" + size +
                ", happyHour=" + happyHour +
                '}';
    }
    //    public DiscountProduct getDiscountProduct(){
//
//    }
//    @Override
//    public float getPrice() {
//    return getPrice()*(1-getSize()/100);
}



