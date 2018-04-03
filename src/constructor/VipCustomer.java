package constructor;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer() {
        this("omjit","100");
        System.out.println("Constructor with no parameter");
    }



    public VipCustomer(String name, String creditLimit) {
        this(name,creditLimit,"omjitsingh");
        System.out.println("Constructor with 2 parameter");
    }

    public VipCustomer(String name, String creditLimit, String email) {
        System.out.println("Constructor with 3 parameter");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }



}
