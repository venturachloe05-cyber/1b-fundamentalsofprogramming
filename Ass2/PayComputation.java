import java.util.Scanner;

public class PayComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hourly pay rate: ");
        double payRate = scanner.nextDouble();
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        double grossPay = payRate * hoursWorked;
        double taxRate = (grossPay <= 2000) ? 0.10 : (grossPay <= 4000) ? 0.12 : (grossPay <= 10000) ? 0.15 : 0.20;
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("Gross Pay: Php " + grossPay);
        System.out.println("Withholding Tax: Php " + withholdingTax);
        System.out.println("Net Pay: Php " + netPay);
    }
}
