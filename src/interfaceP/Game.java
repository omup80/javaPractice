package interfaceP;

import java.util.Iterator;
import java.util.List;

public class Game {
    public void playGame(){
        Player player = new Player("P1","Omjit");
        player.saveObject(player);

        player = new Player("P2","Sachin");
        player.saveObject(player);

        player = new Player("P3","Aditya");
        player.saveObject(player);

        printData(player.getObjects());

        Monster monster = new Monster("M1","Dinasour");
        monster.saveObject(monster);

        monster = new Monster("M2","Elephant");
        monster.saveObject(monster);

        monster = new Monster("M3","Predator");
        monster.saveObject(monster);

        printData(monster.getObjects());



    }

    public void printData(List values){
        Iterator i = values.iterator();
        while(i.hasNext()){
            System.out.println(i.next().toString());
        }
    }
}
