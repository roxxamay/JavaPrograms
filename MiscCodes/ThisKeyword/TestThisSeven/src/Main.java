//The this() constructor call should be used to reuse the constructor
// from the constructor. It maintains the chain between the constructors
// i.e. it is used for constructor chaining. Let's see the example given
// below that displays the actual use of this keyword.

class Student{
    int rollNo ;
    String name ,course ;
    float fee ;


    //constructor
    Student(int rollNo , String name , String course ){
        this.rollNo = rollNo ;
        this.name = name ;
        this.course = course ;
    }

    Student(int rollNo , String name ,String course , float fee){
        this.fee = fee ;
    }

    //method of displaying

    void display(){
        System.out.println(rollNo +  "  " + name  +  "  " + course +  "  " + fee);
    }


}

class Main{
    public static void main(String[] args) {
        Student s1 = new Student(111 , "ankitt " , "java");
        Student s2 = new Student(112, "sumit" , "java " , 57251f);

        s1.display();
        s2.display();
    }
}