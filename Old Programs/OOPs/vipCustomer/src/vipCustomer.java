public class vipCustomer {
    private String name ;
    private double creditLimit ;
    private String emailAddress ;

    public vipCustomer() {
        this("default name" , 1000 , "email@me");
        System.out.println("empty constructor called");
    }

    public vipCustomer(String name, double creditLimit) {
        this(name , creditLimit , "airtel@me");
//        this.name = name;
//        this.creditLimit = creditLimit;
    }

    public vipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

