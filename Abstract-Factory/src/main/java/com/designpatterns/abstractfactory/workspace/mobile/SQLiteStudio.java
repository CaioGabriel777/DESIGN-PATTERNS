package com.designpatterns.abstractfactory.workspace.mobile;

import com.designpatterns.abstractfactory.workspace.DatabaseClient;

public class SQLiteStudio implements DatabaseClient {

    @Override
    public void connect() {
        System.out.println("Connecting to local SQLite database...");
    }
}