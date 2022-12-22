package com.andon.mysql.model;


import jakarta.persistence.*;

@Entity
@Table(name = "stores")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "url")
    private String url;

    @Column(name = "status")
    private int status;

    @Column(name = "revenue")
    private float revenue;

    @Column(name = "sales")
    private int sales;

    public Store() {
    }

    public Store(String url, int status, float revenue, int sales) {
        this.url = url;
        this.status = status;
        this.revenue = revenue;
        this.sales = sales;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", status=" + status +
                ", revenue=" + revenue +
                ", sales=" + sales +
                '}';
    }
}
