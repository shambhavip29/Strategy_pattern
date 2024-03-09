//MallardDuck.java

public class MallardDuck extends Duck {

    public MallardDuck(){
        
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();
    }
    @Override
    void display(){
        System.out.println("MallardDuck mf");
    }
    
}
