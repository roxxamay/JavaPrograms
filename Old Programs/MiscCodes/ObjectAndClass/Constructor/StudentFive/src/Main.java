//copying values without constructor


public class Main {

    public static void main(String[] args) {

        StudentFive s1 =new StudentFive(111 , "karan");
        StudentFive s2 =new StudentFive();

        s2.id = s1.id;
        s2.name = s1.name;

        //displaying

        s1.display();
        s2.display();

    }
}