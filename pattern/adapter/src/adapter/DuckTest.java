package adapter;

public class DuckTest {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        
        Turkey turkey = new WildTurkey();
        Duck duck2 = new TurkeyAdapter(turkey);
        
        System.out.println("The Duck test:");
        duck1.fly();
        duck1.quack();
        
        System.out.println("The Turkey test:");
        duck2.fly();
        duck2.quack();
        
    }

}
