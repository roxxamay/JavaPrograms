
public class Main {
    public static void main(String[] args) {
        String numberAsString = "344423";
        System.out.println("number as a string = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        number+= 1 ;
        numberAsString+=1;

        System.out.println("parsed number = " + number);
        System.out.println("parsed string = " + numberAsString);
    }    
}
