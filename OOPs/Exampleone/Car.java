public class Car {
  private int doors ;
  private int wheels ;
  private String model ;
  private String engine ;
  private String colour ;

  public void setModel(String model){         //this is known as setter
    /**
     * this is used to input the value in a private class object
     */
    this.model = model;


  }

  public String getModel(){     //this is known as getter
    return this.model;        //this is used to return the value of a private class object
  }
}
