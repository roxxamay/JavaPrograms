//If local variables(formal arguments) and instance variables are different,
// there is no need to use this keyword like in the following program:

class Student{
    int rollNo ;
    String name ;
    float fee;

    //constructor

    Student(int r ,String n , float f){
        rollNo = r ;
        name = n ;
        fee = f ;
    }
    //display method

    void display(){
        System.out.println(rollNo + "  " + name +  "  " + fee);
    }


}

class Main{
    public static void main(String[] args) {
        Student s1 =new Student(11 , "ankit ", 5234f);
        Student s2 = new Student(1232 , "smit" , 13141f);

        //displaying them

        s1.display();
        s2.display();

    }
}