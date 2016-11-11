package ru.lconnected.patternexamples.behavioral.mediator;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class Mediator {

    public void sendMessage(String message, BindingComponent receiver) {
        receiver.receive(message);
    }

}
