public class SecondsAndMinutes {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        getDurationString(90, 59);
        getDurationString(91, 054);
        getDurationString(70);
        getDurationString(60);
    }
    
    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println("invalid value");
            return INVALID_VALUE_MESSAGE;
        }
        String rep = ((minutes / 60) + "hr " + (minutes % 60) + "m " + seconds + "s ");
        System.out.println(rep);
        return rep;
    }
    
    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("invalid value");
            return INVALID_VALUE_MESSAGE;
        }else{
            return getDurationString((seconds / 60), (seconds % 60));
        }
    }
}
