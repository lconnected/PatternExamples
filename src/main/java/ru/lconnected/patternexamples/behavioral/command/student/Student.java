package ru.lconnected.patternexamples.behavioral.command.student;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class Student {

    private String name;
    private int id;
    private int grade;
    private boolean attached;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        attached = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isAttached() {
        return attached;
    }

    public void setAttached(boolean attached) {
        this.attached = attached;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Student: {\"name\": \"")
                .append(name)
                .append("\", \"grade\": ")
                .append(grade)
                .append(", \"id\": ")
                .append(id)
                .append("}");
        return result.toString();
    }
}
