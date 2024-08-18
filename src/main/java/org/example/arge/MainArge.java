package org.example.arge;

public class MainArge {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        CarSkeleton gasolin=new GasPoweredCar("gasPoweredCar","gasPoweredCar",20,5);
        CarSkeleton electric=new ElectricCar("electric","electric",30,5);
        CarSkeleton hybrid=new HybridCar("hybrid","hybrid",40,5,3);

        gasolin.startEngine();
        System.out.println(gasolin);

        electric.runEngine();
        System.out.println(electric);

        hybrid.startEngine();
        System.out.println(hybrid);
    }

}




