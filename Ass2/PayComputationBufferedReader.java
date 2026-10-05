import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PayComputation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate: ");
        double payRate = Double.parseDouble(reader.readLine());

        System.out.print("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(reader.readLine());

        double grossPay = payRate * hoursWorked;
        double taxRate = (grossPay <= 2000) ? 0.10 : (grossPay <= 4000) ? 0.12 : (grossPay <= 10000) ? 0.15 : 0.20;
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("Gross Pay: Php " + grossPay);
        System.out.println("Withholding Tax: Php " + withholdingTax);
        System.out.println("Net Pay: Php " + netPay);
    }
}
