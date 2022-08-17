import java.util.Scanner;

public class Objective4Lab2 {
public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int average1;
        int average2;
        int product;
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        average1 = num1 + num2 + num3;
        average2 = average1 / 3;
        System.out.print(average2);
        product = (num1 * num2 * num3);
        System.out.println(" " + product);
        double numb1;
        double numb2;
        BigDecimal numb3; // to store large numbers use BigDecimal
        numb1 = num1 + num2 + num3;
        numb2 = numb1 / 3;
        numb3 = new BigDecimal(String.valueOf(num1)).
                multiply(new BigDecimal(String.valueOf(num2))).multiply(new BigDecimal(String.valueOf(num3)));

        System.out.printf("%.2f", numb2);
        System.out.printf(" %.2f\n", numb3); // add \n at the end for new line

    }
}
