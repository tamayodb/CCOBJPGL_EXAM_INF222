package Me;

import Locations.*;

public interface Tourist {
    
    int budget = 0;

    void visit(Boracay boracay);

    void visit(Palawan palawan);

    void visit(Siargao siargao);

    void visit(Bohol bohol);

    void visit(Cebu cebu);

    default void visit(Location location) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}