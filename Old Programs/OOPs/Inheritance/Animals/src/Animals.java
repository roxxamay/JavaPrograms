public class Animals {

    private String name ;
    private int body ;
    private int size ;
    private int weight ;

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }


    public void eat(){
        System.out.println("animal.eat() called");
    }

    public void move(int speed){
        System.out.println("animal.move() called   animal is moving at speed of  " + speed);
    }
    public Animals(String name, int body, int size, int weight) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
}
