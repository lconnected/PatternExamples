package ru.lconnected.patternexamples.behavioral.command.logger;

import ru.lconnected.patternexamples.behavioral.command.Command;

/**
 * Created by lkhruschev on 10.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class ErrCommand implements Command {

    private Logger logger;
    private String body;

    public ErrCommand(Logger logger) {
        this.logger = logger;
    }

    public ErrCommand(Logger logger, String body) {
        this.logger = logger;
        this.body = body;
    }

    @Override
    public void execute() {
        if (body == null) {
            logger.err("empty body");
        } else {
            logger.err(body);
        }
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ErrCommand: " + body;
    }

}
