class Car {
    //final will make sure engine is initialized
    private final Engine engine;

    public Car(){
       this.engine  = new Engine();
    }

}

class Engine {
    private String type;
}

class RunProg{
  public static void main(String args[]){
    Car car = new Car();

  }
}
