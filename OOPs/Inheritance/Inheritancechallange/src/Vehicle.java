//creating a new public class named vehicle

public class Vehicle {

    private String name ;
    private String size ;

    private int currentVelocity ;
    private int currentDirection ;


    //creating a constructor of the class
    Vehicle(String name , String size){
        this.name = name ;
        this.size = size ;

        this.currentDirection = 0 ;
        this.currentVelocity = 0 ;
    }


    //class for steering
    public void steer(int direction){
        this.currentDirection += currentDirection ;
        System.out.println("Vehicle.steer() : steering at " + currentDirection +  " degrees .");
    }


    //class for moving car
    public void move(int velocity , int direction){
        currentDirection = direction ;
        currentVelocity = velocity ;

        System.out.println("Vehicle.move() : moving at  " + currentVelocity + " in direction " + currentDirection);
    }

    //getter for getname
    public String getName() {
        return name;
    }

    //getter for getsize
    public String getSize() {
        return size;
    }


    //getter for current velocity
    public int getCurrentVelocity() {
        return currentVelocity;
    }

    //getter for current direction
    public int getCurrentDirection() {
        return currentDirection;
    }


    //class for stop
    public void stop(){
        this.currentVelocity = 0 ;
    }
}
