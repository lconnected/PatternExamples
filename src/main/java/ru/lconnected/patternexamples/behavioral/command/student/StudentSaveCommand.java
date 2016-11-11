package ru.lconnected.patternexamples.behavioral.command.student;

import ru.lconnected.patternexamples.behavioral.command.ModernCommand;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class StudentSaveCommand implements ModernCommand {

    private Student student;
    private StudentDAO studentDAO;

    public StudentSaveCommand(Student student, StudentDAO studentDAO) {
        this.student = student;
        this.studentDAO = studentDAO;
    }

    @Override
    public void revert() {
        studentDAO.delete(student);
    }

    @Override
    public void execute() {
        studentDAO.save(student);
    }
}
