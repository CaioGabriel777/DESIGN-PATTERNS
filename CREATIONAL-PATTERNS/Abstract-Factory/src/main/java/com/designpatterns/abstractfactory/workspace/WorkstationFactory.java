package com.designpatterns.abstractfactory.workspace;

// The Abstract Factory
// The interface defines the rules to create a *family* of products.
public interface WorkstationFactory {

    IDE createIDE();
    DatabaseClient createDatabaseClient();
}
