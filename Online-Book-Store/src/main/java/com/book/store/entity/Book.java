package com.book.store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "genre")
    private String genre;

    @Column(name = "price")
    private int price;

    @Column(name = "quantity_available")
    private int quantityAvailable;

    @Column(name = "description")
    private String description;

    @Column(name = "publication_date")
    private Date publicationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    public Book() {
    }

    public Book(int id, String genre, int price, int quantityAvailable, String description, Date publicationDate) {
        this.id = id;
        this.genre = genre;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.description = description;
        this.publicationDate = publicationDate;
    }

    public Book(String genre, int price, int quantityAvailable, String description, Date publicationDate, Publisher publisher) {
        this.genre = genre;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.description = description;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", quantityAvailable=" + quantityAvailable +
                ", description='" + description + '\'' +
                ", publicationDate=" + publicationDate +
                ", publisher=" + publisher +
                '}';
    }
}
