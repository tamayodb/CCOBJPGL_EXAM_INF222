package Me;

import Locations.*;

public class Myself implements Tourist {
    
    private int budget = 1000;
    
    public void visit() {
        if (this.budget - 0 < 0) {
            System.out.println("You don't have enough money to travel.");
        } else {
            System.out.println("Enjoying my stay!");
            budget -= 0;
        }
        checkBudget();
    }

    @Override
    public void visit(Boracay boracay) {
        if (this.budget - boracay.getAirFare() < 0) {
            System.out.println("You don't have enough money to travel to Boracay.");
        } else {
            System.out.println("Enjoying my stay in Boracay!");
            budget -= boracay.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Palawan palawan) {
        if (this.budget - palawan.getAirFare() < 0) {
            System.out.println("You don't have enough money to travel to Palawan.");
        } else {
            System.out.println("Enjoying my stay in Palawan!");
            budget -= palawan.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Siargao siargao) {
        if (this.budget - siargao.getAirFare() < 0) {
            System.out.println("You don't have enough money to travel to Siargao.");
        } else {
            System.out.println("Enjoying my stay in Siargao!");
            budget -= siargao.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Cebu cebu) {
        if (this.budget - cebu.getAirFare() < 0) {
            System.out.println("You don't have enough money to travel to Cebu.");
        } else {
            System.out.println("Enjoying my stay in Cebu!");
            budget -= cebu.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Bohol bohol) {
        if (this.budget - bohol.getAirFare() < 0) {
            System.out.println("You don't have enough money to travel to Bohol.");
        } else {
            System.out.println("Enjoying my stay in Bohol!");
            budget -= bohol.getAirFare();
        }
        checkBudget();
    }
    
    
    public void checkBudget() {
        System.out.println("My budget is " + this.budget);
        System.out.println();
    }

}