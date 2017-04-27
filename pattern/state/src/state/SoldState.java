package state;

class SoldState extends State{
    SoldState(GumballMachine bumballMachine){
        super(bumballMachine);       
    }
    public boolean insertCoin(){  
        System.out.println("Please wait, we're already giving you a gumball");
        return false;        
    }

    public boolean ejectCoin() {
        System.out.println("Sorry, You already turned the grank");
        return false;
    }

    public boolean trunGrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
        return false;
    }

    public boolean dispense() {        
        int count = gumballMachine.releaseBall();
        
        if(count > 0){
            return true;
        }else{
            return false;
        }
    }       
}
