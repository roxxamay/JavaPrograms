
public class one {
    public static void main(String[] args) {

        int highScore = calculatedScore(true, 800, 5, 100) ;
        System.out.println("high score is"+highScore);

        highScore =calculatedScore(true, 100, 8, 200) ;
        System.out.println("high score is" + highScore); 
    }

    public static int calculatedScore(boolean gameover , int score , int level , int bonus ) {
        if(gameover){
           int finalScore = score + (level * bonus) ;
           return finalScore ;
        }
        else{
            return -1 ;
        }
    }
    
}
