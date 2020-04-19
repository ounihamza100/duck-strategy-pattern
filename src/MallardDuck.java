/**
 * @author Hamza Ouni
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBahavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard Duck");
    }
}
