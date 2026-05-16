package com.designpatterns.abstractfactory.workspace.backend;

import com.designpatterns.abstractfactory.workspace.DatabaseClient;

public class DBeaver implements DatabaseClient {

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL using DBeaver...");
    }
}
