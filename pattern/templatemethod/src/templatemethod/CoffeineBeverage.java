package templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CoffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }

    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pour Into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }

    protected boolean getUserInput() {
        String answer = null;
        System.out.print("Would your like condiments with your beverage(y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return false;
        }

        return answer.startsWith("y");
    }
}
