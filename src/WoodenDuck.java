/**
 * @author Hamza Ouni
 */
public class WoodenDuck extends Duck {

    public WoodenDuck() {
        quackBahavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I am wooden duck");
    }
}
