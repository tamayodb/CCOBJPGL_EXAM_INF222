package Locations;

import Me.Tourist;

public class Siargao implements Location{
    
    int airFare = 150;

    public int getAirFare() {
        return airFare; 
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}