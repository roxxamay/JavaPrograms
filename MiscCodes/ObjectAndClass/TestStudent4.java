/**Object and Class Example: Initialization through method

In this example, we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method. Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
 * 
 */
class Student{
  int rollno;
  String name;
  void insertRecord(int r, String n){
    rollno = r;
    name = n ;
  }
  void displayInformation(){
    System.out.println(rollno + " " + name);
}
}



public class TestStudent4 {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();

    s1.insertRecord(111, "karan");
    s2.insertRecord(69, "Aryan");

    s1.displayInformation();
    s2.displayInformation();
  }
}
