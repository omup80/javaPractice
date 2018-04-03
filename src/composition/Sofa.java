package composition;

public class Sofa {
    private int totalSeat;
    private String type;

    public Sofa(int totalSeat, String type) {
        this.totalSeat = totalSeat;
        this.type = type;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public String getType() {
        return type;
    }

    public void make(){
        System.out.println("Sofa with seat "+ totalSeat + ",type "+type+ "has been made");
    }
}
