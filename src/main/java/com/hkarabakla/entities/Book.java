package com.hkarabakla.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id
    private String isbn;

    private String name;

    private double price;

    private String currency;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @ManyToMany(mappedBy = "book")
    private List<Author> author;

    @ManyToMany(mappedBy = "book")
    private List<Orders> orders;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                        ", price='" + price + '\'' +
                        ", currency='" + currency + '\'' +
                ", category='" + category +
        '}';
    }
}
