package models;

public class Motorcycle extends Vehicle {

    // Constructor de una motocicleta
    public Motorcycle(String brand, String reference, int model, String plate) {
        super(brand, reference, model, plate);
    }

    // Implementacion del metodo encender vehiculo
    @Override
    protected String startEngine(int status) {
        if (status == 0) {
            return "The motorcycle is OFF.";
        } else if (status == 1) {
            return "The motorcycle is ON";
        }
        return "";
    }

    // Implementacion del metodo acelerar
    @Override
    protected String accelerate(boolean status) {
        if (status) {
            return "Starting: Vroooom, vroooom, brrrrm, brrrrm";
        }
        return "";
    }

    // Implementacion del metodo frenar
    @Override
    protected String stopCar(boolean status) {
        if (status) {
            return "The motorcycle is braking.";
        }
        return "";
    }
}
