package ru.lconnected.patternexamples.behavioral.mediator;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class FrontendComponent extends BindingComponent {

    public FrontendComponent(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("[Frontend] Received message :" + message + " ");
        System.out.println("[Frontend] ui updated");
    }
}
