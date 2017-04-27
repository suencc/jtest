package state;

import java.util.Random;

public class GumballMachine {
    State noCoin;
    State hasCoin;
    State sold;
    State soldOut;
    State winner;
    Random randomWinner = new Random(System.currentTimeMillis());
    
    State state = soldOut;
    int count = 0;
    public GumballMachine(int numberGumballs){
        noCoin = new NoCoinState(this);
        hasCoin = new HasCoinState(this);
        sold = new SoldState(this);
        soldOut = new SoldOutState(this);
        winner = new WinnerState(this);
        
        this.count = numberGumballs;
        if(numberGumballs > 0){
            state = noCoin;
        }else{
            System.out.println(state);
            state = soldOut;
        }
        
    }
    
    public void insertCoin(){
        if(state.insertCoin())
            setState(hasCoin);
        
    }
    public void ejectCoin(){
        if(state.ejectCoin())
            setState(noCoin);
    }
    public void turnGrank(){
        if(state.trunGrank()){
            int win = randomWinner.nextInt(10);
            if(win == 0 && count >= 2){
                setState(winner);
            }else{
                setState(sold);
            }
            if(state.dispense()){
                setState(noCoin);
            }
        }
        
    }
    public State getState() {
        return state;
    }
    void setState(State state) {
        this.state = state;
    }
    
    int releaseBall(){
        if(count > 0){
            count--;
            System.out.println("A gumball comes rolling out the slot...");
        }else{
            System.out.println("There is not gumball in the machine");
        }
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine [state=" + state + ", count=" + count + "]";
    }
    

}
