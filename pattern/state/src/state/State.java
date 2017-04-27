package state;

public abstract class State {
    GumballMachine gumballMachine;
    
    State(GumballMachine gm){
        this.gumballMachine = gm;
    }

    public boolean insertCoin(){  
        return false;        
    }

    public boolean ejectCoin() {
        return false;
    }

    public boolean trunGrank() {
        return false;
    }

    public boolean dispense() {
        return false;
    }

}
