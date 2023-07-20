/**
 * Object and Class Example: Initialization through reference
 */
class Student{
  int id;
  String name;

}

class Teststudent2{
  public static void main(String[] args) {
    Student s1 = new Student();

    s1.id = 101 ;
    s1.name = "fuck you";
    System.out.println(s1.id +" "+s1.name);
  }
}