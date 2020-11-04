package ge.edu.btu.vehicles;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        Bus busFirst = new Bus(100200300, 200, 32.5, 7, 3.5);
        Train trainFirst = new Train(100200012, 200, 32.5, 20);
        Train trainSecond = new Train(100200012, 300, 40, 30);
        vehicles[0] = busFirst;
        vehicles[1] = trainFirst;
        vehicles[2] = trainSecond;

        try {
            validateVehicles(vehicles);
        } catch (VehicleException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle code: " + vehicle.getCode());
            System.out.println("Vehicle route time: " + Math.round(vehicle.routeTime()) + " minutes"); // Math.round-ით მიახლოვებითი დრო გამოვიტანე
        }

    }

    private static void validateVehicles(Vehicle[] vehicles) throws VehicleException{
        for (int i = 0; i < vehicles.length; i++) {
            for (int j = i + 1; j < vehicles.length; j++) {
                if (vehicles[i].getCode() == vehicles[j].getCode()){
                    throw new VehicleException("Duplicated vehicle code");
                }
            }
        }
    }
}
