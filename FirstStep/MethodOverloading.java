//answer thes comments question
//define method overloading

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("new score is  : " + calculateScore("tim", 500));
        System.out.println("new score is  : " + calculateScore(502));
        calculateScore();
    }
    
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    
    public static int calculateScore(int score) {
        System.out.println("unamed player  scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player no record");
        return 0;
    }

  
}
