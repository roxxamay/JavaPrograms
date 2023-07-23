//java program to overload constructor

public class StudentThree {
    int id ;
    String name ;
    int age ;

    //creating two args

    StudentThree(int i , String n){
        id = i ;
        name = n ;
    }

    //creating three args

    StudentThree(int i , String n , int a){
        id = i ;
        name = n ;
        age = a ;

    }

    //creating display method

    void  display(){
        System.out.println(id + "  " + name + "  " + age );
    }
}
