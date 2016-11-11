package ru.lconnected.patternexamples.behavioral.command.logger;

import java.util.Date;

/**
 * Receiver
 * Created by lkhruschev on 10.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class Logger {

    public void log(String message) {
        System.out.println("[" + new Date() + "] - " + message);
    }

    public void err(String message) {
        System.err.println("[" + new Date() + "] - " + message);
    }

}
