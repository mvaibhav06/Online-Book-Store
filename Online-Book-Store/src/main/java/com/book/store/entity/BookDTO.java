package com.book.store.entity;

import java.util.Date;

public class BookDTO {
    private int id;
    private String genre;
    private int price;
    private int quantityAvailable;
    private String description;
    private Date publicationDate;
    private int publisherId;

    public BookDTO( int id, String genre, int price, int quantityAvailable, String description, Date publicationDate, int publisherId) {
        this.id = id;
        this.genre = genre;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.description = description;
        this.publicationDate = publicationDate;
        this.publisherId = publisherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", quantityAvailable=" + quantityAvailable +
                ", description='" + description + '\'' +
                ", publicationDate=" + publicationDate +
                ", publisherId=" + publisherId +
                '}';
    }
}
