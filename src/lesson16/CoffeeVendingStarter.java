package lesson16;

public class CoffeeVendingStarter {
    public static void main(String[] args) {
        myChoose(3);
        myChoose(1);
    }

    private static void myChoose(int customerChoice) {
        switch (customerChoice) {
            case 3:
                CoffeeMachine.latte();
                break;
            case 1:
                CoffeeMachine.americano();
                break;
            case 2:
                CoffeeMachine.cappuccino();
                break;
            case 4:
                CoffeeMachine.tee();
                break;
            default:
                System.out.println("К сожалению!!!");
                break;
        }
    }

}
