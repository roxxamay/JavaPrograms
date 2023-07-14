public class StInJava {
    public static void main(String[] args) {
        String myString = "this is my string";
        System.out.println("the string is " + myString);

        myString = myString + ",this is more. " ;

        System.out.println(myString);

        myString = myString + " \u00b9 2023" ;

        System.out.println(myString);

        String stringNumber = "300.5" ;

        stringNumber = stringNumber + "40.8" ;

        System.out.println("the string number is " + stringNumber);

        String lastString = "109";
        int myInt = 29 ;

        lastString = lastString + myInt ;

        System.out.println("last string is equal to " + lastString);

        double doubleNumber = 1233.432d ;

        lastString = lastString + doubleNumber ;
        System.out.println("double number is " + lastString);
    }    
}
