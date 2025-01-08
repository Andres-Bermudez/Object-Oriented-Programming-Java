package models;

import java.util.ArrayList;

public class Customer {
    private int id;
    private String name;
    private ArrayList<Vehicle> collectionVehicles = new ArrayList<>();

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Comprar un vehiculo
    public void buyVehicle(Vehicle vehicle, boolean status) {
        if (status) {
            collectionVehicles.add(vehicle);
            System.out.println("$$$ The customer has purchased a vehicle.");
        }
    }

    // Vender vehiculo
    public void sellVehicle(Vehicle vehicle, boolean status) {
        if (status) {
            collectionVehicles.remove(vehicle);
            System.out.println(">>> The customer has sold a vehicle.");
        }
    }

    // Ver vehiculos del cliente
    public void showVehicles() {
        System.out.println("Your Vehicles: ");
        for (Vehicle i : collectionVehicles) {
            System.out.println("    - " + i.getBrand() +  " " + i.getReference());
        }
    }

    // Ver datos del cliente
    @Override
    public String toString() {
        return "models.Customer{" +
                "Id: " + id +
                "\nName: '" + name +
                "\nVehicles: " + collectionVehicles +
                '}';
    }
}
