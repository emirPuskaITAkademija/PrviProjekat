package six.beverage;

public class Main {
    public static void main(String[] args) {
        //coffe -> Coffee, Beverage
        Coffee coffee = new Coffee();
        Main.consumeBeverage(coffee);
        Tea tea = new Tea();
        Main.consumeBeverage(tea);
        CocaCola cocaCola = new CocaCola();
        Main.consumeBeverage(cocaCola);

    }

    private static void consumeBeverage(Beverage beverage){
        System.out.println("Pijem " + beverage.getName() + " i košta me to " + beverage.cost());
    }

//    private static void consumeCoffee(Coffee beverage) {
//        System.out.println("Pijem " + beverage.getName() + " i košta me to " + beverage.cost());
//
//    }
//
//    private static void consumeTea(Tea beverage) {
//        System.out.println("Pijem " + beverage.getName() + " i košta me to " + beverage.cost());
//    }
//
//    private static void consumeCocaCola(CocaCola beverage) {
//        System.out.println("Pijem " + beverage.getName() + " i košta me to " + beverage.cost());
//    }
}
