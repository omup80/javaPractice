package autounboxing;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<Double>();
        transactions.add(0d);
    }

    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

   public static Customer setCustomer(String name){
        return new Customer(name);
    }

}
