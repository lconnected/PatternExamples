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
public class CheapComputerBuilder extends ComputerBuilder {

    public void buildSystemBlock() {
        computer.setSystemBlock("Everest");
    }

    public void buildDisplay() {
        computer.setDisplay("CRT");
    }

    public void buildManipulators() {
        computer.setManipulators("mouse+keyboard");
    }
}
