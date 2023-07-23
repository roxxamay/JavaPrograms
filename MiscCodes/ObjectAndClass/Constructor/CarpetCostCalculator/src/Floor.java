public class Floor {
    private double length ;
    private double width ;

    public Floor(double l , double w){
        length = l ;
        width = w ;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0){
            this.length = 0 ;
        }else {
            this.length = length ;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0 ){
            this.width  = 0 ;
        }
        else {
            this.width = width ;
        }
    }

    public double getArea(){
        return length*width ;
    }
}
