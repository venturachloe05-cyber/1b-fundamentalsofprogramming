import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment3BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(reader.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(reader.readLine());

        System.out.print("Enter entrance exam score: ");
        double entranceExam = Double.parseDouble(reader.readLine());

        double average = (nsat + entranceExam) / 2.0;

        if (salary > 10000 || nsat < 90 || entranceExam < 85) {
            System.out.println("Status: REJECTED");
        } else if (salary <= 3500 && average >= 91) {
            System.out.println("Status: ACCEPTED");
        } else {
            System.out.println("Status: FOR FURTHER STUDY");
        }
    }
}
