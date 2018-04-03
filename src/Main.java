import array.Array;
import arraylist.MobilePhones;
import composition.Bed;
import composition.BedRoom;
import composition.Sofa;
import composition.Telivision;
import constructor.VipCustomer;
import encapsulation.Printer;
import inheritence.Maruti;
import interfaceP.Game;
import linkedList.MusicPlayer;
import oopsExcercise.DeluxHamburger;
import oopsExcercise.Hamburger;
import oopsExcercise.HealthyHamburger;
import polymorphism.Car;
;import java.util.Scanner;

public class Main {
    public static void main(String args[]){

     Main m = new Main();
     //  m.constructor();
      //  m.inheritence();
       // m.composition();
        //m.encapsulation();
       // m.polymorphism();
       // m.oopsExcercise();
       // m.array();
        //m.arrayList();
        //m.musicPlayer();
        m.interfaceProblem();

    }
    public void interfaceProblem(){
        Game game = new Game();
        game.playGame();
    }
    public void musicPlayer(){
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.runMusicPlayer();;
    }
    public void arrayList(){
        MobilePhones mobilePhones = new MobilePhones();
        Scanner scanner = new Scanner(System.in);
        mobilePhones.runMobileApplication(scanner);
        System.out.println("Application Has been exited");
    }
    public void array(){
        Array array = new Array();
        array.array();
    }
    public void oopsExcercise(){
        getBillDetailOfBurgers(new Hamburger("Simple Hamburger","White bread","Chicken",30));
        getBillDetailOfBurgers(new HealthyHamburger());
        getBillDetailOfBurgers(new DeluxHamburger("Pepsi","Uncle Chips"));

    }
    public void getBillDetailOfBurgers(Hamburger hamburger){
        if("oopsExcercise.Hamburger".equals(hamburger.getClass().getName())){
            hamburger.setCarrotAdded(true);
            hamburger.setLettuceAdded(true);
        }
        System.out.println();
        System.out.println("########  BURGER BILLS  ######");
        hamburger.printFinalBillPrice();
    }
    public void polymorphism(){
        Car maruti = new Car.Maruti(3,"Maruti 800");
        Car tata = new Car.Tata(3,"TATA VISTA");
        Car honda = new Car.Honda(3,"Honda IV10");
        System.out.println(maruti.getName());
        maruti.accelerate();
        maruti.startEngine();
        maruti.applyBreak();

        System.out.println(tata.getName());
        tata.accelerate();
        tata.startEngine();
        tata.applyBreak();

        System.out.println(honda.getName());

        honda.accelerate();
        honda.startEngine();
        honda.applyBreak();

    }
    public  void encapsulation(){
        Printer p = new Printer(60,0,false);
        p.fillTonerLevel(100);
        p.printPages(100);
        p.printPages(300);
        p.fillTonerLevel(50);
    }
    public void composition(){
       Bed bed = new Bed(4,6,"Sleep Well");
       Telivision tv  = new Telivision("LED",32,"Sony");
        Sofa sofa = new Sofa(6,"Luxury");
        BedRoom bedRoom = new BedRoom(bed,sofa,tv,1800);
        bedRoom.make();
    }

    public void inheritence(){
        Maruti maruti = new Maruti();
        maruti.move();
        maruti.setModel("MARUTI 800");
        maruti.blowHorn();
        maruti.setTotalSeater(6);

    }

    public void constructor(){
         /* constructor.BankAccount bankAccount = new constructor.BankAccount(100,300,"omjit","omjit.singh@peel-works.com","9975819724");
     constructor.BankAccount bankAccount1 = new constructor.BankAccount();
      System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.getBalance());
      bankAccount.depositFund(100);
      bankAccount.withFund(70);
      bankAccount.withFund(50);*/
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmail());
        System.out.println(vipCustomer.getName());
    }


}
