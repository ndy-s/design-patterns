package org.example.singleton.logger;

/**
 * Demonstrates the Logger singleton usage.
 */
public class SingletonApp {
    public static void main(String[] args) {
        // Get the singleton instance of Logger
        Logger logger = Logger.getInstance();

        // Use the logger to log messages
        logger.log("INFO", "Application started.");
        logger.log("DEBUG", "This is a debug message.");
        logger.log("ERROR", "An error occurred!");

        // Confirm the same instance is used throughout
        Logger anotherLoggerInstance = Logger.getInstance();
        System.out.println("Are logger instances the same? " + (logger == anotherLoggerInstance));
    }
}