public class Dog extends Animals{
    private int eyes ;
    private int legs ;
    private int tail ;
    private int teeth ;
    private String coat ;

    public Dog(String name, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called ");
        chew();
        super.eat();
    }

    public void run(){
        System.out.println("dog.run()  called");
        move(10);
    }

    public void walk(){
        System.out.println("dog.walk() called");
        super.move(4);
    }

    private void moveLegs(int speed){
        System.out.println("dog.moveLegs()  called");
    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }
}
