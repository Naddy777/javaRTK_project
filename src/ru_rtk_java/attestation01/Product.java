package ru_rtk_java.attestation01;

public class Product {
    private String item;
    private float price;
        public Product (String item, float price) {
            this.item = item;
            this.price = price;
        }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
