/**
 * Object and class example
 * main outside the class
 */


//another class
//creating student class
class Student {
    int id;
    String name ;       
}

//creating another student which contain main method

class StudentOne{

    public static void main(String[] args) {
        
        Student s1 = new Student();

        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
