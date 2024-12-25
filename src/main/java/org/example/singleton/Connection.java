package org.example.singleton;

/**
 * Singleton class to manage a single instance of a database connection.
 */
public class Connection {
    // Volatile ensures visibility and prevents instruction reordering issues in multithreaded environments.
    private static volatile Connection instance;
    private String dbName;
    private String username;
    private String password;

    /**
     * Private constructor to restrict instantiation.
     *
     * @param dbName   Name of the database.
     * @param username Database username.
     * @param password Database password.
     */
    private Connection(String dbName, String username, String password) {
        this.dbName = dbName;
        this.username = username;
        this.password = password;
    }


    /**
     * Method to get the single instance of the connection.
     * Uses double-checked locking for thread safety and performance optimization.
     *
     * @param dbName   Name of the database.
     * @param username Database username.
     * @param password Database password.
     * @return Single instance of the Connection class.
     */
    public static Connection getInstance(String dbName, String username, String password) {
        if (instance == null) {
            synchronized (Connection.class) { // Ensures only one thread can enter.
                if (instance == null) { // Double-check to prevent multiple instances.
                    instance = new Connection(dbName, username, password);
                }
            }
        }
        return instance;
    }

    /**
     * Executes a SQL query. Simulates database interaction.
     *
     * @param query SQL query to execute.
     */
    public void sql(String query) {
        System.out.println("Executing SQL on DB " + dbName + ": " + query);
    }
}
