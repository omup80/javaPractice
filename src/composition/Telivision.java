package composition;

public class Telivision {
    private String type;
    private int size;
    private String brand;

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public Telivision(String type, int size, String brand) {

        this.type = type;
        this.size = size;
        this.brand = brand;
    }

    public void make(){
        System.out.println("Telivision with size: "+ size+ ", type: "+ type + ",brand: "+ brand + "is made");
    }
}
