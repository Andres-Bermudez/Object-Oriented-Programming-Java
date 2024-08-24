public class Main {
    public static void main(String[] args) {

        // Creacion instancias de vehiculos
        Automobile audi = new Automobile("Audi", "A3", 2021, "gpt401");
        Motorcycle kawasaki = new Motorcycle("Kawasaki", "z900", 2023, "jfg89h");

        // Creacion instancia cliente
        Customer customer1 = new Customer(1, "Tomas");

        // Compra de vehiculos
        customer1.buyVehicle(audi, true);
        customer1.buyVehicle(kawasaki, true);

        // Ver los vehiculos comprados
        customer1.showVehicles();

        // Venta de un vehiculo
        customer1.sellVehicle(audi, true);
        customer1.showVehicles();
    }
}