class Student{
    int rollNo ;
    String name ;
    float fee ;

    Student(int rollNo , String name , float fee ){
        rollNo = rollNo ;
        name = name ;
        fee = fee ;

    }

    void display(){         //display package
        System.out.println(rollNo + "  " +  name +  "  " + fee);
    }
}

//now main classss

class Main{
    public static void main(String[] args) {
        Student s1 = new Student(111 , " ankit" , 5000f);
        Student s2 = new Student(124 , "aditi " , 6000f);

        //now displying

        s1.display();
        s2.display();

    }
}