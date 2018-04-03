package inheritence;

public class Car extends Vehicle {
    boolean isGearPresent;
    boolean isAutoSteering;
    int totalSeater;
    int totalGear;

    @Override
    public void move() {
        System.out.println("Car.move");
    }
    public void setTotalSeater(int totalSeater){
      this.totalSeater = totalSeater;
        System.out.println("Total Seater "+ totalSeater);
    }
}
