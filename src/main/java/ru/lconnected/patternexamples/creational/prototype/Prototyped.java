/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lconnected.patternexamples.creational.prototype;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author machine
 */
public class Prototyped implements Cloneable{
    
    private int id;
    private String name;
    private Date createdAt;

    public Prototyped(int id, String name) {
        this.id = id;
        this.name = name;
        this.createdAt = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Prototyped(id, name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prototyped other = (Prototyped) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    
}
