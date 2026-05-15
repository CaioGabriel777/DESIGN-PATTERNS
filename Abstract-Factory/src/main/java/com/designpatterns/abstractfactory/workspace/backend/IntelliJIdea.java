package com.designpatterns.abstractfactory.workspace.backend;

import com.designpatterns.abstractfactory.workspace.IDE;

public class IntelliJIdea implements IDE {

    @Override
    public void openProject() {
        System.out.println("Opening Spring Boot project in IntelliJ...");
    }
}
