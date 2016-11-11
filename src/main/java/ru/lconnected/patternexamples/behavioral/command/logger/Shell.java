package ru.lconnected.patternexamples.behavioral.command.logger;

import ru.lconnected.patternexamples.behavioral.command.Command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lkhruschev on 10.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class Shell<T extends Command> {

    private LinkedList<T> uncompleted;
    private ArrayList<T> completed;

    public Shell() {
        this.uncompleted = new LinkedList<>();
        this.completed = new ArrayList<>();
    }

    public void addCommand(T command) {
        this.uncompleted.add(command);
    }

    public void execute() {

        Command commandToExecute = uncompleted.getFirst();
        commandToExecute.execute();
        completed.add((T) commandToExecute);
        uncompleted.remove(commandToExecute);

    }

    public void executeAll() {

        for (Command commandToExecute : uncompleted) {
            commandToExecute.execute();
            completed.add((T) commandToExecute);
        }
        uncompleted = new LinkedList<>();


    }

    public int getUncompletedCount() {
        return uncompleted.size();
    }

    public int getCompletedCount() {
        return completed.size();
    }



}
