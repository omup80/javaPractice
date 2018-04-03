package interfaceP;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String type;
    private String name;
    private static List players = new ArrayList<Monster>();
    public Player(String type, String name){
        this.type  = type;
        this.name = name;
    }

    @Override
    public void saveObject(ISaveable iSaveable) {
        players.add(iSaveable);
    }

    @Override
    public List getObjects() {
        return players;
    }

    @Override
    public String toString() {
        return this.type + ' ' + this.name;
    }
}
