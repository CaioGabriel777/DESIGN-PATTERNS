package com.designpatterns.abstractfactory.workspace.mobile;

import com.designpatterns.abstractfactory.workspace.DatabaseClient;
import com.designpatterns.abstractfactory.workspace.IDE;
import com.designpatterns.abstractfactory.workspace.WorkstationFactory;

public class MobileWorkstationFactory implements WorkstationFactory {

    @Override
    public IDE createIDE() {
        return new AndroidStudio();
    }

    @Override
    public DatabaseClient createDatabaseClient() {
        return new SQLiteStudio();
    }
}
