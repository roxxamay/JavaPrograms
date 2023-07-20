/**
 * obj and class example 
 * initialization through referance
 */
class Student {
    int id;
    String name;

}

class TestStudent{
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 101 ;

        s1.name="shizuka";

        System.out.println("s1.name = " + s1.name + " s1.id = " + s1.id);
    }
}
