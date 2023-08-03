//copying values without constructor


public class StudentFive {

    int id ;
    String name ;

    StudentFive(int i , String n){
        id = i ;
        name = n ;

    }

    StudentFive(){

    }

    //creating displaying method

    void display(){
        System.out.println(id + "  " + name );
    }
}
