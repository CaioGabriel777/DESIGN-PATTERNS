package com.designpatterns.factorymethod.workspace;

public class AnalystWorkspace implements EmployeeWorkspace {

    @Override
    public void setupAccess() {
        System.out.println("Grating full intranet access, AWS environments, and production database read-only.");
    }
}
