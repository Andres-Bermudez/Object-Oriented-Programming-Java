package models;

public abstract class Vehicle {

    // Atributos
    private String brand;
    private String reference;
    private int model;
    private String plate;
    private boolean availability;

    // Constructor para vehiculos con motor (Automobiles, Motocicletas, Camiones, Etc)
    public Vehicle(String brand, String reference, int model, String plate) {
        this.brand = brand;
        this.reference = reference;
        this.model = model;
        this.plate = plate;
        this.availability = true;
    }

    // Constructor para vehiculos como (Bicicletas, Monopatines, Etc)
    public Vehicle(String brand, String reference) {
        this.brand = brand;
        this.reference = reference;
    }

    // Encender/apagar motor
    protected abstract String startEngine(int status);

    // Acelerar vehiculo
    protected abstract String accelerate(boolean status);

    // Frenar vehiculo
    protected abstract String stopCar(boolean status);


    // Getters y Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Ver datos del vehiculo
    @Override
    public String toString() {
        return "Brand: " + getBrand() +
                "\nReference: " + getReference() +
                "\nModel: " + getModel() +
                "\nPlate: " + getPlate();
    }
}
