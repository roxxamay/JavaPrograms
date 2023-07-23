//java programs to intializing the values from one object to another object

public class StudentFour {
    int id ;
    String name ;

    //constructor to initialize integer and string

    StudentFour(int i ,String n){
        id = i ;
        name = n ;

    }

    //constructor to initialize another object

    StudentFour(StudentFour s){
        id = s.id ;
        name = s.name;
    }

    //creating display method

    void display(){
        System.out.println(id + "  " + name );
    }

}
