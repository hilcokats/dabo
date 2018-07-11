package nl.kats.dabo.web;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * This UI is the application entry point. A UI may either represent a browser window (or tab) or some part of a html
 * page where a Vaadin application is embedded.
 *
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be overridden to add
 * component to the user interface and initialize non-component functionality.
 */
@Theme("dabo")
@SpringUI
public class DaboUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label("Hello world!"));
    }

}
