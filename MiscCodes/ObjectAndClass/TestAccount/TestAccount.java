/**Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  

 * 
 */

class Account{
  int acc_no ;
  String name ;
  float amount ;

  //method initializing object

  void insert(int a , String n , float amt){
    acc_no = a ;
    name = n ;
    amount = amt ;

  }

  //deposit method

  void deposit(float amt){
    amount = amount + amt ;
    System.out.println(amt + " deposited");
  }

  //withdrow method

  void withdraw(float amt){
    if(amount < amt){
      System.out.println("indufficient balance");
    }else{
      amount = amount - amt ;
      System.out.println(amt + "withdrawn");
    }
  }

  //method to check balance

  void checkBalance(){
    System.out.println("balance is : " + amount);
  }

  //method to display

  void display(){
    System.out.println(acc_no + " "+ amount);
  }
}



public class TestAccount {
  public static void main(String[] args) {
    Account a1 = new Account();
    a1.insert(8322434,"ankit",1000);
    a1.display();
    a1.checkBalance();
    a1.deposit(40000);
    a1.checkBalance();
    a1.withdraw(15000);
    a1.checkBalance();
  }
}
