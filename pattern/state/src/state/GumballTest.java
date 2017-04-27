package state;

public class GumballTest {

    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine(100);
        
        System.out.println(gm);
        gm.insertCoin();
        gm.turnGrank();
        
        System.out.println(gm);
        gm.insertCoin();
        gm.ejectCoin();
        gm.turnGrank();
        
        System.out.println(gm);
        gm.turnGrank();
        gm.ejectCoin();
        gm.insertCoin();
        gm.turnGrank();
        gm.insertCoin();
        gm.turnGrank();
        
        System.out.println(gm);
    }

}
