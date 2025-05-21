package com.example.books.books.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HotelDto {
    private String name;
    private String location;
    private String description;
    private double price;
    private String bigDescription;
    private String imgUrl;
    private List<String> services;

    public HotelDto(String name, String location, String description, double price, String bigDescription, String imgUrl, List<String> services) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.price = price;
        this.bigDescription = bigDescription;
        this.imgUrl = imgUrl;
        this.services = services;
    }

    @Override
    public String toString() {
        return "HotelDto{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", bigDescription='" + bigDescription + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", services=" + services +
                '}';
    }
}
