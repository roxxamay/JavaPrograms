public class BikeTwo extends Vehicle {
    void run(){
        System.out.println("bike is running safely");
    }

    public static void main(String[] args) {
        BikeTwo obj = new BikeTwo() ;

        obj.run();
    }
}
