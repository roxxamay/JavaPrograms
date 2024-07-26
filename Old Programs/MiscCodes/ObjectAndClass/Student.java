/**
 * Object and class example 
 * main within the class
 */
class Student{          //defining a student class
    //defining field

    int id;             //field or data member or instance var.
    String name;

    //creating a main method inside the studnet class

    public static void main(String[] args) {
        
        //creating an obj or instance

        Student s1 = new Student();      //creating an obj of Students

        //printing the value of obj

        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}