package constructor;

public class BankAccount {
private long accountNumber;
private long balance;
private String customerName;
private String email;
private String phoneNumber;

    public BankAccount(long accountNumber, long balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public BankAccount(){
    this(100,300,"omjit","omjit.singh@peel-works.com","9975819724");

    System.out.println("Constructor Bank account");

}
public BankAccount(long accountNumber, long balance, String customerName, String email, String phoneNumber){
    System.out.println("Constructor With Paramter Bank account");
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
}

public long getAccountNumber(){
 return accountNumber;
}


public long getBalance(){
         return balance;
    }
public String getCustomerName(){
     return customerName;
    }

 public String getEmail(){
      return email;
    }

 public String getPhoneNumber(){
       return  phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   public void depositFund(long balance){
      this.balance = this.balance + balance;
       System.out.println("Current Balance "+ this.balance);
   }
   public  void withFund(long balance){
     if(this.balance - balance <0){
         System.out.print("You don't have sufficient amount");
     }else{
         this.balance = this.balance - balance;
         System.out.println("Current Balance "+ this.balance);
     }
   }
}

