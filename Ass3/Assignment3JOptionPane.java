import javax.swing.JOptionPane;

public class Assignment3JOptionPane {
    public static void main(String[] args) {
        double nsat = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT score:"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter parents' monthly salary:"));
        double entranceExam = Double.parseDouble(JOptionPane.showInputDialog("Enter entrance exam score:"));

        double average = (nsat + entranceExam) / 2.0;

        if (salary > 10000 || nsat < 90 || entranceExam < 85) {
            JOptionPane.showMessageDialog(null, "Status: REJECTED");
        } else if (salary <= 3500 && average >= 91) {
            JOptionPane.showMessageDialog(null, "Status: ACCEPTED");
        } else {
            JOptionPane.showMessageDialog(null, "Status: FOR FURTHER STUDY");
        }
    }
}
