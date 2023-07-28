//JAVA PROGRAMS TO DEMONSTRATE THE USE OF STATIC METHOD

class StudentTwo{
    int rollNo ;
    String name ;
    static String collage = "GCG" ;

    //STATIC METHOD TO CHANGE THE VALUE OF THE STATIC VARIABLE

    static void change(){
        collage = "AMG" ;
    }

    //constractor to initialize the variable

    StudentTwo(int r , String n){
        rollNo = r ;
        name = n ;
    }

    void display(){
        System.out.println(rollNo + "  " + name + "  " + collage );
    }
}

//test class  to create and display the value of object
public class Main {
    public static void main(String[] args) {
        StudentTwo.change();        //calling the changing method

        //creating objects

        StudentTwo s1 = new StudentTwo(111, "karan") ;
        StudentTwo s2 = new StudentTwo(156 , "aryan") ;
        StudentTwo s3 = new StudentTwo(25 , "sonooo") ;

        //calling display method

        s1.display();
        s2.display();
        s3.display();
    }
}