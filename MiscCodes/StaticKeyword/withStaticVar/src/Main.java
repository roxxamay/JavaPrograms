//java programs to illustrate the use of static variable which
//is shared with all objects

class CounterTwo{
    static int count = 0 ;      //will get memory onlyy once and retain its value

    CounterTwo(){
        count++ ;               //incrementing the value of static variable
        System.out.println(count);
    }
}

public class Main {
    public static void main(String[] args) {

        //creating objects

        CounterTwo c1 = new CounterTwo() ;
        CounterTwo c2 = new CounterTwo();
        CounterTwo c3 = new CounterTwo();

    }
}