class Student{
    int rollNo ;
    String name ;
    float fee ;

    Student(int rollNo , String name , float fee){
        this.rollNo = rollNo ;
        this.name = name ;
        this.fee = fee ;
    }

    //display method

    void display(){
        System.out.println(rollNo + "  " + name + "  " + fee );
    }


}

public class Main{
    public static void main(String[] args) {
        Student s1 = new Student(11,"ankit" , 3864f);
        Student s2 = new Student(1414 , "aditi " ,135f);

        s1.display();
        s2.display();

    }
}