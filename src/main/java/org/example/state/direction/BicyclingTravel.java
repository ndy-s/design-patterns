package org.example.state.direction;

public class BicyclingTravel implements Travel {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
