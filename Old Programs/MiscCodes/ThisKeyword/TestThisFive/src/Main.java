//The this() constructor call can be used to invoke the current
// class constructor. It is used to reuse the constructor.
// In other words, it is used for constructor chaining.

class A{

    //constructor
    A(){
        System.out.println("hello a");
    }

    A(int x){
        this();
        System.out.println(x);
    }
}

class Main{
    public static void main(String[] args) {
        A a = new A(10);
    }
}