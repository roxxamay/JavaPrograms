
class Student{
    int rollNo ;        //instance variable
    String name ;
    static String college = "GGC" ;         //static variable

    //now constructor

    Student(int r ,String n){
        rollNo = r ;
        name = n ;

    }

    //method to display the values

    void display(){
        System.out.println(rollNo + "  " + college);
    }


}

//test class to show the values of the object
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student(111 , "karan");
        Student s2 = new Student(222 , "aryan");

        s1.display();
        s2.display();

        //we can change the collage of all object by single line of code

        Student.college = "AMG" ;

        System.out.println("after changing the name of collage  ");
        s1.display();
        s2.display();
    }
}