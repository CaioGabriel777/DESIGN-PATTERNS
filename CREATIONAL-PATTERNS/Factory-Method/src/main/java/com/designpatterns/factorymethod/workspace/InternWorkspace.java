package com.designpatterns.factorymethod.workspace;

public class InternWorkspace implements EmployeeWorkspace {

    @Override
    public void setupAccess() {
        System.out.println("Granting restricted intranet access and basic tools.");
    }
}
