package com.book.store.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "contact_information")
    private String contactInfo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "publisher")
    private List<Book> books;

    public Publisher() {
    }

    public Publisher(String name, String address, String contactInfo, List<Book> books) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", books=" + books +
                '}';
    }
}
