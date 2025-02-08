package org.example.state.direction;

public class StateApp {
    public static void main(String[] args) {
        var directionService = new DirectionService();
        directionService.setTravelMode(new DrivingTravel());
        directionService.getEta();
        directionService.getDirection();
    }
}
