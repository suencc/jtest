package templatemethod;

public class Tea extends CoffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return getUserInput();
    }

}
