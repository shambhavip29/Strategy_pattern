//RedHeadDuck.java

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();
    }
    @Override
    void display(){
        System.out.println("RedHeadDuck");
    }
    
}