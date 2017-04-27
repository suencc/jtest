package state;

class SoldOutState extends State{
    SoldOutState(GumballMachine bumballMachine){
        super(bumballMachine);        
    }
    public boolean insertCoin(){  
        System.out.println("You can't insert a coin, the machine is sold out");
        return false;        
    }

    public boolean ejectCoin() {
        System.out.println("You haven't inserted a coin");
        return false;
    }

    public boolean trunGrank() {
        System.out.println("You turned byt there's no coin");
        return false;
    }

    public boolean dispense() {
        System.out.println("No gumball dispensed");
        return false;
    }       
}
