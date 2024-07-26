class A{
    A getA(){
        return this ;

    }

    void message(){
        System.out.println("hello java");
    }
}

class Main{
    public static void main(String[] args) {
        new A().getA().message();
    }
}