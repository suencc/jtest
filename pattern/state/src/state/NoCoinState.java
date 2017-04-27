package state;

class NoCoinState extends State {
    NoCoinState(GumballMachine bumballMachine){
        super(bumballMachine);        
    }
    public boolean insertCoin(){  
        System.out.println("You inserted a coin");
        return true;        
    }

    public boolean ejectCoin() {
        System.out.println("You haven't inserted a coin");
        return false;
    }

    public boolean trunGrank() {
        System.out.println("You turned but there's no coin");
        return false;
    }

    public boolean dispense() {
        System.out.println("You need to pay first");
        return false;
    }    
}
