package ge.edu.btu.vehicles;

public class Bus extends Vehicle {

    private int stationsNumber;
    private double stopTime; // in minutes

    public Bus() {}

    public Bus(int code, double distance, double averageSpeed, int stationsNumber, double stopTime) {
        super(code, distance, averageSpeed);
        this.stationsNumber = stationsNumber;
        this.stopTime = stopTime;
    }

    public int getStationsNumber() {
        return stationsNumber;
    }

    public void setStationsNumber(int stationsNumber) {
        this.stationsNumber = stationsNumber;
    }

    public double getStopTime() {
        return stopTime;
    }

    public void setStopTime(double stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public double routeTime() {
        return getDistance() / getAverageSpeed() + stationsNumber * stopTime;
    }
}
