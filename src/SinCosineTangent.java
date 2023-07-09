// *********************************************************************************************************
// SinCosineTangent.java
//
// Application that reads the values for the adjacent and opposite lengths as decimal values, then determines and
// displays the values for the sin, cos, and tan. This should prompt for and read each of the two values
// individually.
// *********************************************************************************************************
import java.util.Scanner;
import java.lang.Math;

public class SinCosineTangent {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Prompts user for input of adjacent and opposite values as decimals
        System.out.print("Please enter adjacent value: ");
        double adjacent = scan.nextDouble();
        System.out.print("Please enter opposite value: ");
        double opposite = scan.nextDouble();

        // Calculates the length of the hypotenuse in a right-angled triangle using the Pythagorean theorem using
        // Math.pow & Math.sqrt from the Math library
        double adjacentPow = Math.pow(adjacent, 2);
        double oppositePow = Math.pow(opposite, 2);
        double hypotenuse = Math.sqrt(adjacentPow + oppositePow);

        // This calculates sine, cosine and tangent using values established in earlier code
        double sin = opposite / hypotenuse;
        double cos = adjacent / hypotenuse;
        double tan = opposite / adjacent;

        // Prints out resulting calculations to user in a readable format
        System.out.println("Sine: " + (opposite) + "/" + (hypotenuse) + " = " + sin);
        System.out.println("Cos: " + (adjacent) + "/" + (hypotenuse) + " = " + cos);
        System.out.println("Tan: " + (opposite) + "/" + (adjacent) + " = " + tan);
    }
}