/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lconnected.patternexamples.singleton;

import java.util.Date;

/**
 *
 * @author machine
 */
public class Singleton {
    
    private Singleton instance;
    private Date created;
    
    private Singleton() {
        created = new Date();
    }

    public synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
        
    }
    
    
    
}
