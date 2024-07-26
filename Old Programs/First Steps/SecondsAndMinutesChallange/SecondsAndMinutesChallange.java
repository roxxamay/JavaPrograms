
public class SecondsAndMinutesChallange {
    public static void main(String[] args) {
        System.out.println(getDurationString(99, 40));
        System.out.println(getDurationString(45786));
    }
    private static String getDurationString(long minutes , long seconds){
        if((minutes < 0 ) || (seconds < 0) || (seconds > 59 )){
            return "invalid value" ;

        }

        long hours = minutes / 60 ;
        long remainingMinutes = minutes % 60 ;

        String hourString = hours + "h";
        if(hours < 10 ){
            hourString = "0" + hourString ;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        
        return hourString +" " + minutesString +" " + secondsString  ; 
    }
    private static String getDurationString(long seconds){
        if(seconds < 0){
            return "Invalid value" ;
        }
        long minutes = seconds / 60 ;
        long remainingseconds = seconds % 60 ;

        return getDurationString(minutes, remainingseconds);
    }
}
