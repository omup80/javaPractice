package interfaceP;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String type;
    private String name;

    private static List monsters = new ArrayList<Monster>();

    public Monster(String type, String name){
        this.type  = type;
        this.name = name;
    }
    @Override
    public void saveObject(ISaveable iSaveable) {
       monsters.add(iSaveable);
    }

    @Override
    public List getObjects() {
        return monsters;
    }

    @Override
    public String toString() {
        return this.type + ' ' + this.name;
    }
}
