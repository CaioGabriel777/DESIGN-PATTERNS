package com.designpatterns.factorymethod.workspace.factory;

import com.designpatterns.factorymethod.workspace.EmployeeWorkspace;

public abstract class WorkspaceFactory {

    // The Factory Method!
    public abstract EmployeeWorkspace createWorkspace();

    public void provisionWorkspace() {
        EmployeeWorkspace workspace = createWorkspace();
        System.out.println("Starting automated provisioning for Enterprise...");
        workspace.setupAccess();
    }
}
