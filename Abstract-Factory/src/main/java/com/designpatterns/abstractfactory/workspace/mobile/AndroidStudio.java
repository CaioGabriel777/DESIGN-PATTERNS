package com.designpatterns.abstractfactory.workspace.mobile;

import com.designpatterns.abstractfactory.workspace.IDE;

public class AndroidStudio implements IDE {

    @Override
    public void openProject() {
        System.out.println("Open React Native/Android project...");
    }
}
