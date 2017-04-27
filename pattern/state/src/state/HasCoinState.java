package state;

class HasCoinState extends State{
    HasCoinState(GumballMachine bumballMachine){
        super(bumballMachine);
    }
    public boolean insertCoin(){  
        System.out.println("You con't insert another coin");
        return false;        
    }

    public boolean ejectCoin() {
        System.out.println("Coin returned");
        return true;
    }

    public boolean trunGrank() {
        System.out.println("You turned...");
        return true;
    }

    public boolean dispense() {
        System.out.println("No gumball dispensed");
        return false;
    }   
}
