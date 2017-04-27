package decorator;

public class Starbuzzcoffee {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

        System.out.println("Test for Singleton:");

        Singleton single1 = Singleton.getInstance();
        System.out.println("Singleton references is " + single1.getReferenceCount());

        Singleton single2 = Singleton.getInstance();
        System.out.println("Singleton references is " + single2.getReferenceCount());

    
    }

}
