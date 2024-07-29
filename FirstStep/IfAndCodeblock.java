public class IfAndCodeblock {
    public static void main(String[] args) {
        boolean gameOver = true ;
        int score = 1500 ;
        int levelCompleted = 5 ;
        int bonus = 100 ;

        if (score ==5000) {
            System.out.println("your score was 5000");
        }
        if (score < 5000 && score>1000) {
            System.out.println("your score less than 5000 but greater than 1000");
        }else if (score<1000) {
            System.out.println("your score was less than 1000");
        }
        else {
            System.out.println("got here");
        }

        //another example

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus );
            System.out.println("your final score was : " + finalScore);
        }
        // System.out.println(finalScore);


        score = 10000 ;
        levelCompleted = 8 ;
        bonus= 200 ;

        System.out.println("score : "+score);
        System.out.println("levelcompleted : "+levelCompleted);
        System.out.println("bonus : "+bonus);

        if (gameOver) {
            int secondFinalScore = score + ( levelCompleted * bonus );
            System.out.println("your second final score was : " + secondFinalScore);
        }
    }
}
