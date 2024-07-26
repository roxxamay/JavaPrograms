//Multilevel Inheritance Example
//When there is a chain of inheritance, it is known as multilevel inheritance.
// As you can see in the example given below, BabyDog class inherits the Dog class
// which again inherits the Animal class, so there is a multilevel inheritance.

public class Main {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();

        d.weep();
        d.bark();
        d.eat();
    }
}