package inheritence;

public class Maruti extends Car {
    String model;

    @Override
    public void move() {
        System.out.println("Maruti.move");
    }
    public void setModel(String model){
        this.model = model;
        System.out.println("Model of maruti: "+ model);
    }
}
