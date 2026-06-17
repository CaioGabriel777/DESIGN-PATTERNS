package com.designpatterns.facade.database;

public class DatabaseProfileManager {

    public void createProfile(String name) {
        System.out.println("💾 Inserted new employee '" + name + "' into PostgreSQL.");
    }

}
