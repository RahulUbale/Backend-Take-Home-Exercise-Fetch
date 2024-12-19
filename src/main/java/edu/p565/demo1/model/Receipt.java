package edu.p565.demo1.model;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

// Receipt.java
public class Receipt {
    private UUID id;
    private String retailer;
    private String purchaseDate;

    public Receipt(UUID id, String retailer, String purchaseDate, String purchaseTime, List<Item> items, double total) {
        this.id = id;
        this.retailer = retailer;
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.items = items;
        this.total = total;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRetailer() {
        return this.retailer;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public String getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseTime() {
        return this.purchaseTime;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Receipt id(UUID id) {
        setId(id);
        return this;
    }

    public Receipt retailer(String retailer) {
        setRetailer(retailer);
        return this;
    }

    public Receipt purchaseDate(String purchaseDate) {
        setPurchaseDate(purchaseDate);
        return this;
    }

    public Receipt purchaseTime(String purchaseTime) {
        setPurchaseTime(purchaseTime);
        return this;
    }

    public Receipt items(List<Item> items) {
        setItems(items);
        return this;
    }

    public Receipt total(double total) {
        setTotal(total);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Receipt)) {
            return false;
        }
        Receipt receipt = (Receipt) o;
        return Objects.equals(id, receipt.id) && Objects.equals(retailer, receipt.retailer) && Objects.equals(purchaseDate, receipt.purchaseDate) && Objects.equals(purchaseTime, receipt.purchaseTime) && Objects.equals(items, receipt.items) && total == receipt.total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, retailer, purchaseDate, purchaseTime, items, total);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", retailer='" + getRetailer() + "'" +
            ", purchaseDate='" + getPurchaseDate() + "'" +
            ", purchaseTime='" + getPurchaseTime() + "'" +
            ", items='" + getItems() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }
    private String purchaseTime;
    private List<Item> items;
    private double total;

    public Receipt() {
        this.id = UUID.randomUUID();
    }

    // Getters and setters
}