package models;

public class Automobile extends Vehicle {

    // Constructor de un automovil
    public Automobile(String brand, String reference, int model, String plate) {
        super(brand, reference, model, plate);
    }

    // Implementacion del metodo encender motor
    @Override
    protected String startEngine(int status) {
        if (status == 0) {
            return "The automobile is OFF.";
        } else if (status == 1) {
            return "The automobile is ON";
        }
        return "";
    }

    // Implementacion del metodo acelerar
    @Override
    protected String accelerate(boolean status) {
        if (status) {
            return "Starting: Brumm Bruum";
        }
        return "";
    }

    // Implementacion del metodo frenar
    @Override
    protected String stopCar(boolean status) {
        if (status) {
            return "The automobile is braking.";
        }
        return "";
    }
}
