package org.rapidpm.vaadin.nano.component;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;

public class DemoComponent extends Composite<Div> {


  public DemoComponent() {
    getContent().add("DemoComponent Version 001");
  }
}
