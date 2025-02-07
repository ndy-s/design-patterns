package org.example.state.abuse;

// Abusing the state pattern (not recommended)
public class StateApp {
    public static void main(String[] args) {
        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
    }
}
