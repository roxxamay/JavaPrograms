class Animal{
    void eat(){
        System.out.println("eating......");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("eating.. breadddd");
    }

    void bark(){
        System.out.println("barking....");
    }

    void work(){
        super.eat();
        bark();
    }

}


public class Main {
    public static void main(String[] args) {
        Dog d =new Dog() ;

        d.work();
    }
}