package lesson25;

import java.util.Scanner;

public class HW25IndexBMI {
    public static void main(String[] args) {
        //BMI=kg/m² (вес/рост*рост)
        System.out.println(BodyMassIndexCalculator());

    }

    private static double BodyMassIndexCalculator() {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        System.out.println("Please, enter your weight: ");
        weight = scanner.nextDouble();
        System.out.println("Please, enter your height: ");
        height = scanner.nextDouble();
        return (weight / (height * height));
    }
}
