package org.example.singleton.database;

/**
 * Helper class to manage and abstract the connection logic.
 */
public class DatabaseHelper {

    private static Connection connection;

    /**
     * Returns a singleton database connection.
     * Ensures the connection is created only once.
     *
     * @return Singleton Connection instance.
     */
    public static Connection getConnection() {
        if (connection == null) {
            connection = Connection.getInstance("MyDB", "root", "password");
        }
        return connection;
    }
}
