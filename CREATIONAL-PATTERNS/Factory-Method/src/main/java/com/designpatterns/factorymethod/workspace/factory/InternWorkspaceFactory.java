package com.designpatterns.factorymethod.workspace.factory;

import com.designpatterns.factorymethod.workspace.EmployeeWorkspace;
import com.designpatterns.factorymethod.workspace.InternWorkspace;

public class InternWorkspaceFactory extends WorkspaceFactory {

    @Override
    public EmployeeWorkspace createWorkspace() {
        return new InternWorkspace();
    }
}
