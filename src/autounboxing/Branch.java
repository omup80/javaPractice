package autounboxing;

import java.util.ArrayList;
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public static Branch setBranch(String branch){
        return new Branch(branch);
    }

    public Customer findCustomer(String customerName){

        for(Customer customer:customers){
            if(customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.println("Customer "+ customerName +"Does not exists");
        return null;
    }

    public void addCustomer(String customerName){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            this.customers.add(Customer.setCustomer(customerName));
            System.out.println("Customer :"+customerName+" added in the system");
        }else{
            System.out.println("Customer "+ customerName +"could not be added in the system as it already exists");

        }

    }

    public void showAllCustomers(){
        for(int i=0;i<customers.size();i++){
            System.out.println( (i+1) + ". Customer Name "+ this.customers.get(i).getName());
        }
    }

    public void showCustomerTransaction(String customerName){
        Customer customer = findCustomer(customerName);
        if(customer == null){
           System.out.println("Customer :"+customerName+" does not exists");
        }else{
            System.out.println("Transactions of customer: "+ customer.getName());
            for(Double amount : customer.getTransactions()){
                System.out.println(amount);
            }

        }
    }

    public void doTransaction(String customerName, Double amount){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            System.out.println("Customer :"+customerName+" does not exists");
        }else{
            customer.getTransactions().add(amount);

        }
    }


}
