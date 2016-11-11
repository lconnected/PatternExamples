package ru.lconnected.patternexamples.behavioral.command;

import junit.framework.TestCase;
import org.junit.Test;
import ru.lconnected.patternexamples.behavioral.command.logger.ErrCommand;
import ru.lconnected.patternexamples.behavioral.command.logger.LogCommand;
import ru.lconnected.patternexamples.behavioral.command.logger.Logger;
import ru.lconnected.patternexamples.behavioral.command.logger.Shell;

import static org.junit.Assert.assertEquals;

/**
 * Created by lkhruschev on 10.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class CommandTest extends TestCase {

    private Logger logger;
    private Shell shell;


    @Override
    public void setUp() throws Exception {
        super.setUp();
        logger = new Logger();
        shell = new Shell();
    }


    @Test
    public void testAddCommand() throws Exception {
        Command logHelloWorld = new LogCommand(logger, "Hello World!");
        Command errHelloWorld = new ErrCommand(logger, "err Hello World!");
        shell.addCommand(logHelloWorld);
        shell.addCommand(errHelloWorld);
        assertEquals(2, shell.getUncompletedCount());
        assertEquals(0, shell.getCompletedCount());
    }

    @Test
    public void testExecute() throws Exception {
        testAddCommand();
        assertEquals(2, shell.getUncompletedCount());
        shell.execute();
        assertEquals(1, shell.getUncompletedCount());
        assertEquals(1, shell.getCompletedCount());
        shell.execute();
        assertEquals(0, shell.getUncompletedCount());
        assertEquals(2, shell.getCompletedCount());
    }

    @Test
    public void testExecuteAll() throws Exception {

        testAddCommand();
        shell.executeAll();
        assertEquals(0, shell.getUncompletedCount());
        assertEquals(2, shell.getCompletedCount());
    }
}