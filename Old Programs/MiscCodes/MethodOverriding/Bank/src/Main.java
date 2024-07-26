class Bank{
    int getRateOfIntrest(){
        return 0 ;
    }
}

class SBI extends Bank{
    int getRateOfIntrest(){
        return 8 ;
    }
}

class ICCI extends Bank{
    int getRateOfIntrest(){
        return 9 ;
    }
}

class AXIS extends Bank{
    int getRateOfIntrest(){
        return 7 ;
    }
}



public class Main {
    public static void main(String[] args) {
        SBI s = new SBI() ;
        ICCI i = new ICCI() ;
        AXIS a = new AXIS() ;

        System.out.println("sbi rate of intrest " + s.getRateOfIntrest());

        System.out.println("icci rate of intrest "+i.getRateOfIntrest());

        System.out.println("axis Rate of intrest " +a.getRateOfIntrest());
    }
}