//using parameterized constructor

public class StudentTwo {
    int id ;
    String name ;

    //creating parametrized constructor

    StudentTwo(int i , String n){
        id = i ;
        name = n ;
    }

    //methods of displaying the values

    void display(){
        System.out.println(id + "  " + name );
    }
}
