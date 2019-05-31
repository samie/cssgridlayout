package org.vaadin.example;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * The main view contains a button and a click listener.
 */
@Route
@Tag("main-view")
@HtmlImport("main-view.html")
public class MainView extends PolymerTemplate<TemplateModel> {

    @Id("header")
    private Div header;

    @Id("content")
    private Div content;

    @Id("sidebar")
    private Div sidebar;

    @Id("sidebar2")
    private Div sidebar2;

    @Id("footer")
    private Div footer;

    public MainView() {
        getElement().getStyle().set("padding","40px");
        getElement().getStyle().set("width","100%");
        getElement().getStyle().set("height","100%");
        getElement().getStyle().set("box-sizing","border-box");

        header.add(new Text("Header"));
        content.add(new Text("Content"));
        content.add(new Button("Sample Button", e->{
            Notification.show(e.getSource().getText()+" clicked");
        }));
        sidebar.add(new Text("Sidebar"));
        sidebar2.add(new Text("Sidebar 2"));
        footer.add(new Text("Footer"));
    }
}
