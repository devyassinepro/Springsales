package com.andon.mysql.model;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "url")
    private String url;


    @Column(name = "prix")
    private float prix;

    @Column(name = "todaysales")
    private float todaysales;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Product() {

    }

    public Product(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
