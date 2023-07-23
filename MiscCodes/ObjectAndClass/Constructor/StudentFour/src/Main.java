//java programs to intializing the values from one object to another object


public class Main {

    public static void main(String[] args) {

        //creating object

        StudentFour s1 = new StudentFour(111 , "karan");
        StudentFour s2 = new StudentFour(s1);

        //displaying

        s1.display();
        s2.display();
    }
}