package fr.kayp.bol.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;

public class TemplateBl implements Serializable {
    public String seller;
    public String buyer;
    public int amount;
    public int price;

    public TemplateBl(String seller, String buyer, int amount, int price) {
        this.seller = seller;
        this.buyer = buyer;
        this.amount = amount;
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}