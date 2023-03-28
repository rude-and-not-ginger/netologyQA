package org.example.product;

import lombok.Data;

@Data
public class Smartphone extends Product {
    protected String manufacture;
    public Smartphone(int id, String name, int cost, String manufacture) {
        super(id, name, cost);
        this.manufacture = manufacture;
    }
}
