public class Main {
    public static void main(String[] args) {

        vipCustomer adiAccount = new vipCustomer("aditya" ,1500 ,"fvreiuyb@gmail.com") ;

        System.out.println("account holder name " + adiAccount.getName());
        System.out.println("account limit is " + adiAccount.getCreditLimit());
        System.out.println("email address is " + adiAccount.getEmailAddress());

        vipCustomer roxxAccount = new vipCustomer("roxx " , 1598);
        System.out.println("name " + roxxAccount.getName());
        System.out.println("account limit is " + roxxAccount.getCreditLimit());
        System.out.println("email address is " + roxxAccount.getEmailAddress());

        vipCustomer amayAccount = new vipCustomer() ;
        System.out.println("name " + amayAccount.getName());
        System.out.println("account limit is " + amayAccount.getCreditLimit());
        System.out.println("email address is " + amayAccount.getEmailAddress());

    }
}