/**
 * @author Hamza Ouni
 */
public class MuteQuack implements QuackBahavior {
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
