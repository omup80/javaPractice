package oopsExcercise;

import com.sun.org.apache.bcel.internal.classfile.Constant;

// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.
public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private int price;
    protected int finalPrice;
    private boolean isLettuceAdded = false;
    private boolean isTomatoAdded = false;
    private boolean isCarrotAdded  = false;
    private boolean isOnionAdded = false;
    private static int lettucePrice = 10;
    private  static  int tomatoPrice = 8;
    private static int carrotPrice = 12;

    public static int getLettucePrice() {
        return lettucePrice;
    }

    public static int getTomatoPrice() {
        return tomatoPrice;
    }

    public static int getCarrotPrice() {
        return carrotPrice;
    }

    public static int getOnionPrice() {
        return onionPrice;
    }

    private static  int onionPrice = 15;

    public void setLettuceAdded(boolean lettuceAdded) {
        isLettuceAdded = lettuceAdded;
    }

    public void setTomatoAdded(boolean tomatoAdded) {
        isTomatoAdded = tomatoAdded;
    }

    public void setCarrotAdded(boolean carrotAdded) {
        isCarrotAdded = carrotAdded;
    }

    public void setOnionAdded(boolean onionAdded) {
        isOnionAdded = onionAdded;
    }


    public Hamburger(String name,String breadRollType, String meat, int price) {
        this.name =name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;

    }

    public int getBasePrice(){
        return this.price;
    }

    public  String getName(){
        return this.name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }
    public void setFinalPrice(){
        int totalPrice = price;
        if(isLettuceAdded)
            totalPrice += lettucePrice;

        if(isTomatoAdded)
            totalPrice += tomatoPrice;

        if(isCarrotAdded)
            totalPrice += carrotPrice;

        if(isOnionAdded)
            totalPrice += onionPrice;

        finalPrice = totalPrice;
    }
    public int getFinalPrice(){
        return this.finalPrice;

    }

    public void  getBaseBillDetail(){
        setFinalPrice();
        System.out.println("Burger: "+name);
        System.out.println("breadRollType: "+breadRollType);
        System.out.println("Meat: "+ meat);
        System.out.println("Base Price: "+ price);
        if(isLettuceAdded)
            System.out.println("Lettuce Price: "+ lettucePrice);

        if(isTomatoAdded)
            System.out.println("Tomato Price: "+ tomatoPrice);

        if(isCarrotAdded)
            System.out.println("Carrot Price: "+ carrotPrice);

        if(isOnionAdded)
            System.out.println("Onion Price: "+ onionPrice);


    }

    public void printFinalBillPrice(){
        getBaseBillDetail();
        System.out.println("Total Bill: "+ getFinalPrice());
    }
}

