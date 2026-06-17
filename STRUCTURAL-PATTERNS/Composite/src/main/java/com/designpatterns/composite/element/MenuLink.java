package com.designpatterns.composite.element;

// The Leaf
// This represents a single clickable menu link. It has on children.
public class MenuLink implements IntranetElement {

    private String title;
    private String url;

    public MenuLink(String title, String url) {
        this.title = title;
        this.url = url;
    }

    @Override
    public void render() {
        System.out.println(" 🔗 Rendering Link: " + title + " -> [" + url + "]");
    }
}
