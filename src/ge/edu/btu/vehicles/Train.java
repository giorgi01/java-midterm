package ge.edu.btu.vehicles;

public class Train extends Vehicle {

    private double blockingCoefficient;

    public Train() {}

    public Train(int code, double distance, double averageSpeed, double blockingCoefficient) {
        super(code, distance, averageSpeed);
        this.blockingCoefficient = blockingCoefficient;
    }

    public double getBlockingCoefficient() {
        return blockingCoefficient;
    }

    public void setBlockingCoefficient(double blockingCoefficient) {
        this.blockingCoefficient = blockingCoefficient;
    }

    @Override
    public double routeTime() {
        return getDistance()  / getAverageSpeed() + getBlockingCoefficient();
    }
}
