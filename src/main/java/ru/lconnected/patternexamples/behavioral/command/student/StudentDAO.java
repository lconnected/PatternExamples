package ru.lconnected.patternexamples.behavioral.command.student;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class StudentDAO {

    public void save(Student student) {
        student.setAttached(true);
        System.out.println("saved " + student.toString());
    }

    public void delete(Student student) {
        student.setAttached(false);
        System.out.println("deleted " + student.toString());
    }

}
