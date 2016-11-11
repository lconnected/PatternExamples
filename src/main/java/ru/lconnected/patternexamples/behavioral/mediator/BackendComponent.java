package ru.lconnected.patternexamples.behavioral.mediator;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class BackendComponent extends BindingComponent {


    public BackendComponent(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {

        System.out.println("[Backend] Received message(request): " + message + " ");

    }
}
