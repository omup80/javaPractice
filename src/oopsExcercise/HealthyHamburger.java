package oopsExcercise;

public class HealthyHamburger extends Hamburger {
    private boolean isCucumborAdded ;
    private  boolean isCapsicumAdded;
    private static int capsicumPrice = 25;
    private static  int cucumborPrice = 23;

    public static int getCapsicumPrice() {
        return capsicumPrice;
    }

    public static int getCucumborPrice() {
        return cucumborPrice;
    }


    public HealthyHamburger() {
        super("Healthy Burger", "Multi Grains", "Beef", 80);
        isCapsicumAdded = true;
        isCucumborAdded = true;
        setCarrotAdded(true);
        setLettuceAdded(true);
        setOnionAdded(true);
        setTomatoAdded(true);
     }


    @Override
    public void setFinalPrice() {
        super.setFinalPrice();
        finalPrice = finalPrice + this.capsicumPrice + this.cucumborPrice;
    }

    @Override
    public void getBaseBillDetail() {
        super.getBaseBillDetail();
        System.out.println("Capcisum Price: "+capsicumPrice);
        System.out.println("Cacumbor Price: "+cucumborPrice);

    }



}