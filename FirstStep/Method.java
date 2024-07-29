//what is methods? explain with example
//how to use methods with perimeter
public class Method {
    public static void main(String[] args) {
        //before methods perimeter
        // int score = 10000 ;
        // int levelCompleted = 8 ;
        // int bonus= 200 ;
        // boolean gameOver = true ;
        

        calculateScore(true,800,10,3000);
        calculateScore(true, 10000, 8, 2000);

        int highScorePosition = claculateHighScorePosition(100);
        displayHighScorePosition("adii", highScorePosition);

        highScorePosition = claculateHighScorePosition(1200);
        displayHighScorePosition("dev", highScorePosition);

        highScorePosition = claculateHighScorePosition(800);
        displayHighScorePosition("sudhir", highScorePosition);

        highScorePosition = claculateHighScorePosition(500);
        displayHighScorePosition("shubham", highScorePosition);
    }
    //void does not return anything
    // public static void calculateScore(boolean gameOver , int score , int levelCompleted , int bonus){
        

    //     System.out.println("score : "+score);
    //     System.out.println("levelcompleted : "+levelCompleted);
    //     System.out.println("bonus : "+bonus);

    //     if (gameOver) {
    //         int secondFinalScore = score + ( levelCompleted * bonus );
    //         System.out.println("your second final score was : " + secondFinalScore);
    //     }
    //     System.out.println();
    //     System.out.println("==========================================================================================");
    //     System.out.println();
    // }
        public static int calculateScore(boolean gameOver , int score , int levelCompleted , int bonus){
        

        System.out.println("score : "+score);
        System.out.println("levelcompleted : "+levelCompleted);
        System.out.println("bonus : "+bonus);

        if (gameOver) {
            int secondFinalScore = score + ( levelCompleted * bonus );
            System.out.println("your second final score was : " + secondFinalScore);
            return secondFinalScore ;
       }else{
            return -1 ; 
       }

       //or
       //return -1 ;
       //in prg term -1 is error related to value   

    }

    public static void displayHighScorePosition(String name , int position ){
        System.out.println(name + " scored " + position + " in Score board ");
    }

    public static int claculateHighScorePosition(int score ){
        if (score >= 1000) {
            return 1 ;
        }else if (score >= 500 & score < 1000) {
            return 2 ;
        }else if (score >= 100 && score < 500) {
            return 3 ;
        }else {
            return 4 ;
        }
    }
}
