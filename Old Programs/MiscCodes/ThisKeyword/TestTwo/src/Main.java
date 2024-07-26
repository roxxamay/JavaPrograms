class A5{
    void m(){
        System.out.println(this);       //prints same refernace id

    }

}

class Main{
    public static void main(String[] args) {
        A5 obj = new A5();

        System.out.println(obj);        //print referance id

        obj.m();
    }
}