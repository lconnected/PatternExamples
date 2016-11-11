package ru.lconnected.patternexamples.behavioral.mediator;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public abstract class BindingComponent {

    protected Mediator mediator;

    public BindingComponent(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(String message);

}
