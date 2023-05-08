import Locations.*;
import Me.*;

public class App {
    public static void main(String[] args) {
        
        Location boracay = new Boracay();
        Location bohol = new Bohol();
        Location cebu = new Cebu();
        Location palawan = new Palawan();
        Location siargao = new Siargao();

        Tourist danyssa = new Myself();

        siargao.accept(danyssa);
        boracay.accept(danyssa);
        palawan.accept(danyssa);
        cebu.accept(danyssa);
        bohol.accept(danyssa);
        palawan.accept(danyssa);
        cebu.accept(danyssa);
        bohol.accept(danyssa);

    }
}