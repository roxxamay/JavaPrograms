public class Strings {
    public static void main(String[] args) {
        //answer all the following question
        //define String , its size , its representation ,its casting
        //how Strings in java are Immutable?
        //why the code we used to append Strings was inefficient?
        //is String is a class?? if yes then how do we use it as a data type?

        String myString = "this is a string" ;
        System.out.println("my string is equal to : " + myString);

        //adding to string
        myString = myString + ", and this is more . " ;
        System.out.println("my string is equal to : " + myString);
        
        //again
        myString = myString + " \u00A9 2024" ;
        System.out.println("my string is equal to : " + myString);

        //others exapmles
        String numberString = "250.55" ;
        numberString = numberString + "49.95" ;

        System.out.println("numberString : " + numberString);

        // examples

        int myInt = 50 ;
        String lastString = "50" ;
        lastString = lastString + myInt ;

        System.out.println("lastString : " + lastString);
    }
}
