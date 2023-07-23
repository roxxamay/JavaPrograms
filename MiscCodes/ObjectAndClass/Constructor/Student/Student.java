// Example of default constructor that displays the default values

class Student{
    int id ;
    String name ;

    //methods to display id and name

    void display(){
        System.out.println(id + "  " +name );
    }

    public static void main(String[] args) {
        //creating objects

        Student s1 = new Student() ;
        Student s2 = new Student() ;

        //displaying the values of the objects

        s1.display();       //both are null bcoz we dont input any value
        s2.display();
    }
}