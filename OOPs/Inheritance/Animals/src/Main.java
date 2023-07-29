public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals("animal",1,3,10);

        Dog dog = new Dog("rocky" , 11,2,4,1,30,"silky");

        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("aany" , 2 , 1 , 1 , 2 , 4);

        fish.rest();
        fish.swim(19);

    }
}