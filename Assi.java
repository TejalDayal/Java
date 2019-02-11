import java.util.Scanner;

public class Assi {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Intialization Phasejav
    double sold = 0.0;
    int soldCounter = 0;

    double baseRate = 200.00;
    double commissionRate = 10;

    System.out.print("Enter total of sold item or -1 if done: ");
    double value = input.nextDouble();

    while (value > 0)
    {
        sold = sold + value;
        soldCounter = soldCounter + 1;

        System.out.print("Enter price of sold item or -1 if done: ");
        value = input.nextDouble();
    } 

    double totalCommission = sold * commissionRate + baseRate;
    System.out.printf("%nTotal pay for the week is: %f%n", totalCommission);

  }

}