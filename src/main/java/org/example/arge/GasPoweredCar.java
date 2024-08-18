package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double getAvgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.getAvgKmPerLiter = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    public double getAverageKmPerLiter() {
        return getAvgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void startEngine() {
        System.out.println("Gasolin car's engine is starting");
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" + "carName = " +getName()+ ", type = "+ getDescription() +
                ", avgKmPerLiter = " + getAvgKmPerLiter +
                ", batterySize = " + cylinders +
                '}';
    }
}
