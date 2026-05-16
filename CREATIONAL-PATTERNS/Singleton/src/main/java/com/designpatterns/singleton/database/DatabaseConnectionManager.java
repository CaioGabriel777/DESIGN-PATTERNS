package com.designpatterns.singleton.database;

public class DatabaseConnectionManager {

    private static volatile DatabaseConnectionManager instance;

    private DatabaseConnectionManager() {
        System.out.println("Initializing the database connection pool...");
    }

    public static DatabaseConnectionManager getInstance() {
        // First check (no locking) - makes it fast if instance already exists
        if (instance == null) {

            // Lock the class so only one thread can enter at a time
            synchronized (DatabaseConnectionManager.class) {

                // Second check (with locking) - ensures no other thread created it while we waited
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
