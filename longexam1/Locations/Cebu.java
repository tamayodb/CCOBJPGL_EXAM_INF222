package Locations;

import Me.Tourist;

public class Cebu implements Location{
    
    int airFare = 70;

    public int getAirFare() {
        return airFare; 
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}