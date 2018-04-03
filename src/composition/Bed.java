package composition;

public class Bed {
    private int width;
    private int length;
    private String brand;

    public Bed(int width, int length, String brand) {
        this.width = width;
        this.length = length;
        this.brand = brand;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getBrand() {
        return brand;
    }
    public void make(){
        System.out.println("Bed with width: "+width +" length: "+ length + " brand: "+brand + " has been made");
    }
}
