package polymorphism;

public class Car {
    private boolean engine;
    private int noOfCylinder;
    private int noOfWheels;
    private String name;

    public Car(int noOfCylinder, String name) {
        this.engine = true;
        this.noOfCylinder = noOfCylinder;
        this.noOfWheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getNoOfCylinder() {
        return noOfCylinder;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public String getName() {
        return name;
    }
    public void startEngine(){
        System.out.println("Car.engine Started");
    }
    public void accelerate(){
        System.out.println("Car.accelerated");
    }
    public void applyBreak(){
        System.out.println("Car.break applied");
    }

    public static class Maruti extends Car{
        public Maruti(int noOfCylinder, String name) {
            super(noOfCylinder, name);
        }

        public void startEngine(){
            System.out.println("Maruti.engine Started");
        }
        public void accelerate(){
            System.out.println("Maruti.accelerated");
        }

    }

    public static class Tata extends Car{
        public Tata(int noOfCylinder, String name) {
            super(noOfCylinder, name);
        }

        public void startEngine(){
            System.out.println("Tata.engine Started");
        }
        public void accelerate(){
            System.out.println("Tata.accelerated");
        }
    }

    public static class Honda extends Car{
        public Honda(int noOfCylinder, String name) {
            super(noOfCylinder, name);
        }

        public void startEngine(){
            System.out.println("Honda.engine Started");
        }
        public void accelerate(){
            System.out.println("Honda.accelerated");
        }
    }
}


