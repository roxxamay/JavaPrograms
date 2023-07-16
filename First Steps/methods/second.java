
public class second {
    public static void main(String[] args) {
        
        int highScorePosition = calculateHighScorePosition(1500) ;
        displayHighScorePosition("tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(158);
        displayHighScorePosition("roxxy", highScorePosition);

        highScorePosition = calculateHighScorePosition(599);
        displayHighScorePosition("chandan", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("xyz", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("abc", highScorePosition);

        highScorePosition = calculateHighScorePosition(300);
        displayHighScorePosition("pqrs", highScorePosition);

        highScorePosition = calculateHighScorePosition(399);
        displayHighScorePosition("lmn", highScorePosition);
    }   
    
    public static void displayHighScorePosition(String playerName , int highScorePosition) {

        System.out.println(playerName + " is managed to get into position " +                highScorePosition);
        
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000){
            return 1 ;
        }else if(playerScore >= 1000 ){
            return 2 ;
        }else if(playerScore >= 100 ){
            return 3 ;
        }
        
            return 4 ;
    }
        
}
