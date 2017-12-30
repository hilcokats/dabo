package nl.kats.dabo.web;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.FileResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import javax.servlet.annotation.WebServlet;
import java.io.File;

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

    private CssLayout opponentDeck = new CssLayout();
    private CssLayout opponentDiscardPile = new CssLayout();
    private CssLayout opponentHand = new CssLayout();
    private CssLayout opponentCore = new CssLayout();
    private CssLayout opponentDilemmas = new CssLayout();
    private VerticalLayout opponentMission1 = new VerticalLayout();
    private VerticalLayout opponentMission2 = new VerticalLayout();
    private VerticalLayout opponentMission3 = new VerticalLayout();
    private VerticalLayout opponentMission4 = new VerticalLayout();
    private VerticalLayout opponentMission5 = new VerticalLayout();

    private CssLayout yourDilemmas = new CssLayout();
    private CssLayout yourCore = new CssLayout();
    private CssLayout yourHand = new CssLayout();
    private CssLayout yourDiscardPile = new CssLayout();
    private CssLayout yourDeck = new CssLayout();
    private VerticalLayout yourMission1 = new VerticalLayout();
    private VerticalLayout yourMission2 = new VerticalLayout();
    private VerticalLayout yourMission3 = new VerticalLayout();
    private VerticalLayout yourMission4 = new VerticalLayout();
    private VerticalLayout yourMission5 = new VerticalLayout();

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        final VerticalLayout layout = new VerticalLayout();

        MenuBar menu = new MenuBar();
        MenuBar.MenuItem game = menu.addItem("Game", null);
        game.addItem("New...", FontAwesome.PLUS, null);
        game.addItem("Give up...", FontAwesome.SIGN_OUT, null);
        MenuBar.MenuItem deck = menu.addItem("Deck", null);
        deck.addItem("Deck list", FontAwesome.LIST, null);
        menu.setWidth("100%");

        layout.addComponent(menu);
        layout.setSpacing(true);
        layout.setMargin(true);

        Panel table = new Panel();

        VerticalLayout universe = new VerticalLayout();
        HorizontalLayout space = new HorizontalLayout();
        HorizontalLayout opponent = new HorizontalLayout();
        HorizontalLayout you = new HorizontalLayout();
        universe.addComponent(opponent);
        universe.addComponent(space);
        universe.addComponent(you);
        universe.setExpandRatio(opponent, .2F);
        universe.setExpandRatio(space, .6F);
        universe.setExpandRatio(you, .2F);
        universe.setSizeFull();

        opponent.addComponent(opponentDeck);
        opponent.addComponent(opponentDiscardPile);
        opponent.addComponent(opponentCore);
        opponent.addComponent(opponentHand);
        opponent.addComponent(opponentDilemmas);
        opponent.setSizeFull();

        HorizontalLayout yourSpace = new HorizontalLayout();
        yourSpace.addComponent(yourMission1);
        yourSpace.addComponent(yourMission2);
        yourSpace.addComponent(yourMission3);
        yourSpace.addComponent(yourMission4);
        yourSpace.addComponent(yourMission5);
        yourSpace.setExpandRatio(yourMission1, .2F);
        yourSpace.setExpandRatio(yourMission2, .2F);
        yourSpace.setExpandRatio(yourMission3, .2F);
        yourSpace.setExpandRatio(yourMission4, .2F);
        yourSpace.setExpandRatio(yourMission5, .2F);
        HorizontalLayout opponentSpace = new HorizontalLayout();
        opponentSpace.addComponent(opponentMission1);
        opponentSpace.addComponent(opponentMission2);
        opponentSpace.addComponent(opponentMission3);
        opponentSpace.addComponent(opponentMission4);
        opponentSpace.addComponent(opponentMission5);
        opponentSpace.setExpandRatio(opponentMission1, .2F);
        opponentSpace.setExpandRatio(opponentMission2, .2F);
        opponentSpace.setExpandRatio(opponentMission3, .2F);
        opponentSpace.setExpandRatio(opponentMission4, .2F);
        opponentSpace.setExpandRatio(opponentMission5, .2F);
        space.addComponent(yourSpace);
        space.addComponent(opponentSpace);
        space.setExpandRatio(yourSpace, .5F);
        space.setExpandRatio(opponentSpace, .5F);
        space.setSizeFull();
        yourSpace.setSizeFull();
        opponentSpace.setSizeFull();

        you.addComponent(yourDilemmas);
        you.addComponent(yourHand);
        you.addComponent(yourCore);
        you.addComponent(yourDiscardPile);
        you.addComponent(yourDeck);
        you.setSizeFull();

        setUpMissions();

        table.setContent(universe);
        table.setSizeFull();
        layout.addComponent(table);

        layout.setExpandRatio(table, 1F);
        layout.setSizeFull();
        setContent(layout);
    }

    private void setUpMissions() {
        String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

        // Image as a file resource
        FileResource mission1 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01167ab.jpg"));
        FileResource mission2 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01183.jpg"));
        FileResource mission3 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01191.jpg"));
        FileResource mission4 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01200.jpg"));
        FileResource mission5 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01201.jpg"));

        // Show the image in the application
        Image image1 = new Image("", mission1);
        Image image2 = new Image("", mission2);
        Image image3 = new Image("", mission3);
        Image image4 = new Image("", mission4);
        Image image5 = new Image("", mission5);

        image1.setWidth("100%");
        image2.setWidth("100%");
        image3.setWidth("100%");
        image4.setWidth("100%");
        image5.setWidth("100%");

        yourMission1.addComponent(image1);
        yourMission2.addComponent(image2);
        yourMission3.addComponent(image3);
        yourMission4.addComponent(image4);
        yourMission5.addComponent(image5);

        // Image as a file resource
        FileResource mission6 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01167ab.jpg"));
        FileResource mission7 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01183.jpg"));
        FileResource mission8 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01191.jpg"));
        FileResource mission9 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01200.jpg"));
        FileResource mission10 = new FileResource(new File(basepath + "/WEB-INF/images/ST2E-EN01201.jpg"));

        // Show the image in the application
        Image image6 = new Image("", mission1);
        Image image7 = new Image("", mission2);
        Image image8 = new Image("", mission3);
        Image image9 = new Image("", mission4);
        Image image10 = new Image("", mission5);

        image6.setWidth("100%");
        image7.setWidth("100%");
        image8.setWidth("100%");
        image9.setWidth("100%");
        image10.setWidth("100%");

        opponentMission1.addComponent(image6);
        opponentMission2.addComponent(image7);
        opponentMission3.addComponent(image8);
        opponentMission4.addComponent(image9);
        opponentMission5.addComponent(image10);
    }

    @WebServlet(urlPatterns = "/*", name = "DaboUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = DaboUI.class, productionMode = false)
    public static class DaboUIServlet extends VaadinServlet {
    }
}
