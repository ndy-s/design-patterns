package org.example.state.direction;

public class DirectionService {
    private Travel travelMode;

    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public Travel getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(Travel travelMode) {
        this.travelMode = travelMode;
    }
}
