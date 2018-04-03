package autounboxing;

import java.util.ArrayList;
import java.util.Scanner;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName){

        for(Branch branch:branches){
            if(branch.getName().equalsIgnoreCase(branchName)){
                return branch;
            }
        }
        System.out.println("Branch "+ branchName +"Does not exists");
        return null;
    }

    private void addBranch(String branchName){
        Branch branch = findBranch(branchName);
        if(branch == null){
            this.branches.add(Branch.setBranch(branchName));
            System.out.println("Branch :"+branchName+" added in the system");
        }else{
            System.out.println("Branch "+branchName +"could not be added in the system as it already exists");

        }

    }

    private void showAllBranches(){
        for(int i=0;i<branches.size();i++){
            System.out.println( (i+1) + ". Branch Name "+ branches.get(i).getName());
        }
    }

    public void runBankApplication() {


        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Select the option");
            System.out.println("\n"+
                    "1. Create Branch \n" +
                    "2. Show All Branches \n"+
                    "3. Add Customer In Branch \n" +
                    "4. Add Transaction in Bank \n" +
                    "5. Check All Customer In Branch \n" +
                    "6. Check All Transactions of Customer");

            Integer option = scanner.nextInt();
            String branchName;
            String customerName;
            Branch branch;
            Customer customer;
            switch (option) {
                case 1:
                    System.out.println("Enter the Branch Name: ");
                    scanner.nextLine();
                    branchName = scanner.nextLine();
                    addBranch(branchName);
                case 2:
                    showAllBranches();
                case 3:
                    System.out.println("Enter the Branch Name: ");
                    scanner.nextLine();
                    branchName = scanner.nextLine();
                    branch = findBranch(branchName);
                    if(branch != null){
                        System.out.println("Enter the Customer Name: ");
                        scanner.nextLine();
                        customerName = scanner.nextLine();
                        branch.addCustomer(customerName);
                    }

                case 4:
                    System.out.println("Enter the Branch Name: ");
                    scanner.nextLine();
                    branchName = scanner.nextLine();
                    branch = findBranch(branchName);
                    if(branch != null){
                        System.out.println("Enter the Customer Name: ");
                        scanner.nextLine();
                        customerName = scanner.nextLine();
                        System.out.println("Enter the Amount For Transaction: ");
                        Double amount =  scanner.nextDouble();
                        branch.doTransaction(customerName,amount);
                    }
                case 5:
                    System.out.println("Enter the Branch Name: ");
                    scanner.nextLine();
                    branchName = scanner.nextLine();
                    branch = findBranch(branchName);
                    if(branch != null){
                        branch.showAllCustomers();
                    }

                case 6:
                    System.out.println("Enter the Branch Name: ");
                    scanner.nextLine();
                    branchName = scanner.nextLine();
                    branch = findBranch(branchName);
                    if(branch != null){
                        System.out.println("Enter the Customer Name: ");
                        scanner.nextLine();
                        customerName = scanner.nextLine();
                        branch.showCustomerTransaction(customerName);
                    }
            }
        }
    }
}
