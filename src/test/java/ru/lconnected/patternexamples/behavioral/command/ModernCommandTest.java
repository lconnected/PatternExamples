package ru.lconnected.patternexamples.behavioral.command;

import org.junit.Before;
import org.junit.Test;
import ru.lconnected.patternexamples.behavioral.command.student.Student;
import ru.lconnected.patternexamples.behavioral.command.student.StudentDAO;
import ru.lconnected.patternexamples.behavioral.command.student.StudentSaveCommand;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class ModernCommandTest {

    private List<Student> students;
    private StudentDAO studentDAO;

    @Before
    public void setUp() throws Exception {
        studentDAO = new StudentDAO();
        students = new ArrayList<>();
        students.add(new Student("Ivan", 0, 4));
        students.add(new Student("Petr", 1, 3));
        students.add(new Student("Julia", 2, 4));
    }

    @Test
    public void testRevert() throws Exception {
        ModernCommand saveIvan = new StudentSaveCommand(students.get(0), studentDAO);
        ModernCommand savePetr = new StudentSaveCommand(students.get(1), studentDAO);
        ModernCommand saveJulia = new StudentSaveCommand(students.get(2), studentDAO);
        saveIvan.execute();
        savePetr.execute();
        saveJulia.execute();
        saveJulia.revert();

        int attachedCount = 0;
        for(Student student : students) {
            if(student.isAttached() == true) {
                attachedCount++;
            }
        }
        assertEquals(2, attachedCount);
    }
}