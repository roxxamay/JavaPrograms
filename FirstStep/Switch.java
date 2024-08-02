public class Switch {
    public static void main(String[] args) {
        // int value = 1;
        // if (value==1) {
        //     System.out.println("value is 1");
        // }else if (value==2) {
        //     System.out.println("value is two");
        // } else {
        //     System.out.println("was not 1 or 2");
        // }
        //altier code

        int switchValue = 3 ;
        switch (switchValue) {
            case 1:
                System.out.println("walue is one");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 5:
            case 3:
            case 4:
                System.out.println("was a 3 or 4 or a 5");
                System.out.println("actually it was a " + switchValue);
            default:
                break;
        }
        //more code here

        char switchChar = 'F';
        switch (switchChar) {
            case 'A':
                System.out.println("it is A");
                break;
            case 'B':
                System.out.println("it is B");
                break;
            case 'C':
                System.out.println("it is C");
                break;
            case 'D':
                System.out.println("it is C");
                break;
            case 'E':
                System.out.println("it is E");
                break;
            default:
                System.out.println("not found");
                break;
        }
        

        //new

        // String month = "January";
         String month = "JUNe";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("jan");
                break;
            case "june":
                System.out.println("jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }

    }
}
