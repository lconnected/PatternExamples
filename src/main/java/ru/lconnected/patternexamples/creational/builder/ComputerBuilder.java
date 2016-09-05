/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lconnected.patternexamples.creational.builder;

/**
 *
 * @author lk
 */
public abstract class ComputerBuilder {

    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createNewComputer() {
        computer = new Computer();
    }

    public abstract void buildSystemBlock();

    public abstract void buildDisplay();

    public abstract void buildManipulators();
}
