package com.designpatterns.factorymethod.workspace.factory;

import com.designpatterns.factorymethod.workspace.AnalystWorkspace;
import com.designpatterns.factorymethod.workspace.EmployeeWorkspace;

public class AnalystWorkspaceFactory extends WorkspaceFactory {

    @Override
    public EmployeeWorkspace createWorkspace() {
        return new AnalystWorkspace();
    }
}
