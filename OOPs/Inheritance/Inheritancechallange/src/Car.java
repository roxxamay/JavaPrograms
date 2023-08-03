//class for car which is extended vehicle

public class Car extends Vehicle{
    private int wheels ;
    private int door ;
    private int gears ;
    private boolean isMannual ;

    private int currentGear ;


    //constructor for car class
    public Car(String name, String size, int wheels, int door, int gears, boolean isMannual) {
        super(name, size);
        this.wheels = wheels;
        this.door = door;
        this.gears = gears;
        this.isMannual = isMannual;
        this.currentGear = 1;

    }

    //class for change gear
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear() : Changed to " + this.currentGear +  " gear ");
    }


    //class for changing velocity
    public void changeVelocity(int speed ,int direction){
        move(speed,direction);
        System.out.println("car.changeVelocity() : Velocity  " + speed + " direction " +direction);
    }


}
