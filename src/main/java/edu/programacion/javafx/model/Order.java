package edu.programacion.javafx.model;

import java.util.Date;

public class Order {
    private int id;
    private Date date;
    private int customerId;

    public Order(int id, Date date, int customerId) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
