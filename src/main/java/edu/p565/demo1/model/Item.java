package edu.p565.demo1.model;
import java.util.Objects;

public class Item {
    private String shortDescription;
    private double price;

    public Item() {
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item shortDescription(String shortDescription) {
        setShortDescription(shortDescription);
        return this;
    }

    public Item price(double price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Item)) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(shortDescription, item.shortDescription) && price == item.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortDescription, price);
    }

    @Override
    public String toString() {
        return "{" +
            " shortDescription='" + getShortDescription() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }
    

    public Item(String shortDescription, double price) {
        this.shortDescription = shortDescription;
        this.price = price;
    }

    // Getters and setters
}