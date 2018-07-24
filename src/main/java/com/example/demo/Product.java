package com.example.demo;

public class Product {
private int ilosc;
private String name;
private String producer;
private int serianNr;
private String imgUrl;
private double price;

    public Product() {
    }

    public Product(String name, String producer,String img, int serianNr, double price) {
        this.name = name;
        this.producer = producer;
        this.serianNr = serianNr;
        this.price = price;
        this.imgUrl = img;

    }

    public Product(int ilosc, String name, String producer, int serianNr, String imgUrl, double price) {
        this.ilosc = ilosc;
        this.name = name;
        this.producer = producer;
        this.serianNr = serianNr;
        this.imgUrl = imgUrl;
        this.price = price;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public String getImg() {
        return imgUrl;
    }

    public void setImg(String img) {
        this.imgUrl = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSerianNr() {
        return serianNr;
    }

    public void setSerianNr(int serianNr) {
        this.serianNr = serianNr;
    }

    public double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
