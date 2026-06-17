package com.designpatterns.composite.element;

import java.util.ArrayList;
import java.util.List;

// The Composite
// This represents a folder or a section that contains other IntranetElements.
public class MenuSection implements IntranetElement {

    private String title;

    // Notice how it holds a list of the Interface, not specific classes!
    private List<IntranetElement> children = new ArrayList<>();

    public MenuSection(String title) {
        this.title = title;
    }

    public void addElement(IntranetElement element) {
        children.add(element);
    }

    @Override
    public void render() {
        System.out.println("📁 Rendering Section: " + title);

        // It delegates the work to its children
        for (IntranetElement child : children) {
            child.render();
        }
    }
}
