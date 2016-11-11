package ru.lconnected.patternexamples.behavioral.mediator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lkhruschev on 11.11.2016.
 * lkhruschev@alvioneurope.ru
 * Skype: levasfx
 */
public class MediatorTest {

    private Mediator mediator;
    private BindingComponent frontendComponent;
    private BindingComponent backendComponent;

    @Before
    public void setUp() throws Exception {
        mediator = new Mediator();
        frontendComponent = new FrontendComponent(mediator);
        backendComponent = new BackendComponent(mediator);
    }

    @Test
    public void testSendMessage() throws Exception {
        mediator.sendMessage("/api/users/get?filter=all", backendComponent);
        mediator.sendMessage("[{\"name\": \"Ivan\"}, {\"name\": \"Petr\"}, {\"name\": \"Julia\"}]", frontendComponent);
    }
}