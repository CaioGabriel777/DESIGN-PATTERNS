package com.designpatterns.abstractfactory.workspace.backend;

import com.designpatterns.abstractfactory.workspace.DatabaseClient;
import com.designpatterns.abstractfactory.workspace.IDE;
import com.designpatterns.abstractfactory.workspace.WorkstationFactory;

public class BackendWorkstationFactory implements WorkstationFactory {

    @Override
    public IDE createIDE() {
        return new IntelliJIdea();
    }

    @Override
    public DatabaseClient createDatabaseClient() {
        return new DBeaver();
    }
}
