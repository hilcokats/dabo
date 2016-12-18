package nl.kats.dabo.web;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

import javax.servlet.annotation.WebServlet;

/**
 * This UI is the application entry point. A UI may either represent a browser window (or tab) or some part of a html
 * page where a Vaadin application is embedded.
 *
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be overridden to add
 * component to the user interface and initialize non-component functionality.
 *
 * To test, run 'mvn jetty:run' (or 'mvn jetty:run -pl web' from the project root). The application can then be
 * viewed via http://localhost:8080/dabo-web
 */
@Theme("dabo")
public class DaboUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();

        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() + ", it works!"));
        });

        layout.addComponents(name, button);
        layout.setMargin(true);
        layout.setSpacing(true);

        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "DaboUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = DaboUI.class, productionMode = false)
    public static class DaboUIServlet extends VaadinServlet {
    }
}
