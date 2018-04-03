package oopsExcercise;

public class DeluxHamburger extends  Hamburger {
    private String drinkType;
    private String chipsType;
    private static int drinkPrice = 40;

    @Override
    public void setFinalPrice() {
        super.setFinalPrice();
        finalPrice = finalPrice + drinkPrice + chipsPrice;
    }

    public static int getDrinkPrice() {
        return drinkPrice;
    }

    public static int getChipsPrice() {
        return chipsPrice;
    }

    private static int chipsPrice = 20;

    @Override
    public void getBaseBillDetail() {
        super.getBaseBillDetail();
        System.out.println("Drink Type: "+ drinkType+ "Drink Price: "+ drinkPrice);
        System.out.println("Chips Type: "+ chipsType+ "Chips Price: "+ chipsPrice);


    }

    public DeluxHamburger(String drinkType, String chipsType) {
        super("Delux Burger","Multi Grain Fresh", "Pork", 90);
        this.drinkType = drinkType;
        this.chipsType = chipsType;
        setCarrotAdded(true);
        setLettuceAdded(true);
        setOnionAdded(true);
        setTomatoAdded(true);
    }




}
