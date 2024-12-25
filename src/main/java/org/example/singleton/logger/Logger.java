package org.example.singleton.logger;

/**
 * A Logger class that uses Singleton pattern to ensure only one instance exists.
 * This is useful for consistent logging across the application.
 */
public class Logger {

    // Volatile variable to ensure proper synchronization in multithreaded environments
    private static volatile Logger instance;

    // Private constructor to prevent instantiation from outside
    private Logger() {}

    /**
     * Get the singleton instance of Logger.
     * Double-checked locking ensures thread-safety and improves performance.
     *
     * @return the single instance of Logger
     */
    public static Logger getInstance() {
        if (instance == null) { // First check (without locking) for performance
            synchronized (Logger.class) {
                if (instance == null) { // Second check (with locking) for thread-safety
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    /**
     * Logs a message.
     *
     * @param level the log level (e.g., INFO, ERROR)
     * @param message the log message
     */
    public void log(String level, String message) {
        // Simulate writing to a log file or console
        System.out.println(level + ": " + message);
    }
}