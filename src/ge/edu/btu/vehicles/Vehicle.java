package ge.edu.btu.vehicles;

public abstract class Vehicle {
    private int code;
    private double distance;
    private double averageSpeed;

    public Vehicle() {}

    public Vehicle(int code, double distance, double averageSpeed){
        this.code = code;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }

    public int getCode(){
        return code;
    }

    public double getDistance() {
        return distance;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public abstract double routeTime();
}
