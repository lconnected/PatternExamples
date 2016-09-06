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
public class Computer {

    private String display = null;
    private String systemBlock = null;
    private String manipulators = null;

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setSystemBlock(String systemBlock) {
        this.systemBlock = systemBlock;
    }

    public void setManipulators(String manipulators) {
        this.manipulators = manipulators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;

        Computer computer = (Computer) o;

        if (display != null ? !display.equals(computer.display) : computer.display != null) return false;
        if (systemBlock != null ? !systemBlock.equals(computer.systemBlock) : computer.systemBlock != null)
            return false;
        return !(manipulators != null ? !manipulators.equals(computer.manipulators) : computer.manipulators != null);

    }

    @Override
    public int hashCode() {
        int result = display != null ? display.hashCode() : 0;
        result = 31 * result + (systemBlock != null ? systemBlock.hashCode() : 0);
        result = 31 * result + (manipulators != null ? manipulators.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("display: ");
        result.append(display);
        result.append(" sysBlock: ");
        result.append(systemBlock);
        result.append(" manipulators: ");
        result.append(manipulators);
        return result.toString();
    }
}
