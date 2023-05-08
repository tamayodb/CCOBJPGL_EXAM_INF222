package Locations;

import Me.Tourist;

public class Boracay implements Location{
    
    int airFare = 100;

    public int getAirFare() {
        return airFare; 
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
