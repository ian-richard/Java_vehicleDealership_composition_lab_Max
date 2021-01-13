package BuyersSellers;

import vehicles.VehicleType;

import java.util.ArrayList;

public class Dealership {
    private int money;
    private String name;
    private ArrayList<VehicleType> garage;

    public Dealership(int money, String name){
        this.money = money;
        this.name = name;
        this.garage = new ArrayList<VehicleType>();
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public ArrayList<VehicleType> getGarage() {
        return garage;
    }
}
