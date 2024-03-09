//DecoyDuck.java
public class DecoyDuck extends Duck {
    
    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
        swimBehaviour = new SwimNoWay();
    }
    
    @Override
    public void display() {
        System.out.println("Decoy mf");
    }
    
}