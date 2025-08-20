package ru_rtk_java.homework7;

public class DiscountProduct extends Product {
    private  Discount discount;
    public DiscountProduct(String item, float price, Discount discount) {
        super(item, price);
        this.discount = discount;
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





