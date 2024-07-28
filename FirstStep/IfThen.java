//answer the follwoing question
//what is if-then ? explain with syntax , and example
//explain all logical operaters and operands with syntax and example
//explain logical AND , Logical OR , bitwise operator , ternary operator

public class IfThen {
    public static void main(String[] args) {
        boolean isAlien = false ;
        if( isAlien == false ){
            System.out.println("It is not Alien ! ");
            System.out.println("And I am Scared Of Aliens");
        }
        System.out.println("====================================================================================");
        int topScore = 100 ;

        if(topScore == 100){
            System.out.println("You got the High Score ! ");
        }
        System.out.println("====================================================================================");

        if(topScore != 100){
            System.out.println("You got the High Score ! ");
        }
        System.out.println("====================================================================================");

        if(topScore >= 100){
            System.out.println("You got the High Score ! ");
        }
        System.out.println("====================================================================================");

         topScore = 80 ;
        if(topScore <= 100){
            System.out.println("You got the High Score ! ");
        }
        System.out.println("====================================================================================");


        int seconTopScore = 60 ;
        if (topScore > seconTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100 ! ");            
        }
        System.out.println("====================================================================================");

        if((topScore > 90 ) || (seconTopScore <= 90)){
            System.out.println("Either Or Both Of the Condition is true");
            System.out.println("((topScore > 90 ) || (seconTopScore <= 90))");
        }
        System.out.println("====================================================================================");

        // int newValue = 50 ;
        // if (newValue = 50 ) {
        //     System.out.println("is this error ????????? ");
        // }

        int newValue = 50 ;
        if (newValue == 50 ) {
            System.out.println("is this error ????????? ");
            System.out.println("naa...         int newValue = 50 ;\n" + //
                                "        if (newValue = 50 ) {\n" + //
                                "            System.out.println(\"is this error ????????? \");\n" + //
                                "        }this will give error");
        }
        System.out.println("====================================================================================");

        System.out.println();
        System.out.println();

        boolean isCar = false ;
        if (isCar = true) {
            System.out.println("        boolean iscar = false ;\n" + //
                                "        if (iscar = true) {\n" + //
                                "            System.out.println(\"This is Not suppose to happen ....!!!!! \");\n" + //
                                "        }");
            System.out.println("This is Not suppose to happen ....!!!!! ");
        }

        System.out.println("====================================================================================");

        boolean wasCar = isCar ? true : false ;

        if (wasCar) {
            System.out.println("wasCar is True ...!!!");
        }

    }
}
