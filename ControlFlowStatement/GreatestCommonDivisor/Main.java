

public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first , int second){
        if(first >= 10 && second >= 10){
            int smallerNumber = Math.min(first, second);

            for(int gcd = smallerNumber ; gcd > 0 ; gcd --){
                if((first % gcd == 0) && (second % gcd == 0)){
                    return gcd ;
                }
            }
        }
        return -1 ;
    }
}
