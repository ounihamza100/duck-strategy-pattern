/**
 * @author Hamza Ouni
 */
public abstract class Duck {

    QuackBahavior quackBahavior;
    FlyBehavior flyBehavior;

    public Duck(){

    }

    public void performQuack() {
        quackBahavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void  display() ;

    public void swim() {
        System.out.println("All ducks float");
    }

    public void setQuackBahavior(QuackBahavior quackBahavior) {
        this.quackBahavior = quackBahavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
