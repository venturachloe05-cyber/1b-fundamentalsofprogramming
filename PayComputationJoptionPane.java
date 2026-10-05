import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate:"));
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:"));

        double gross = rate * hours;
        double tax = gross * ((gross <= 2000) ? 0.10 : (gross <= 4000) ? 0.12 : (gross <= 10000) ? 0.15 : 0.20);
        double net = gross - tax;

        JOptionPane.showMessageDialog(null, "Gross Pay: Php " + gross + "\nWithholding Tax: Php " + tax + "\nNet Pay: Php " + net);
    }
}
