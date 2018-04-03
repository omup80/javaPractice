package composition;

public class BedRoom {
    private Bed bed;
    private Sofa sofa;
    private Telivision tv;
    private int size;

    public BedRoom(Bed bed, Sofa sofa, Telivision tv, int size) {

        this.bed = bed;
        this.sofa = sofa;
        this.tv = tv;
        this.size = size;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public void setTv(Telivision tv) {
        this.tv = tv;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Bed getBed() {

        return bed;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Telivision getTv() {
        return tv;
    }

    public int getSize() {
        return size;
    }

    public void make(){
        bed.make();
        sofa.make();
        tv.make();
        System.out.println("Bed room with size +"+size + " has been made");
    }


}
