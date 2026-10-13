import java.util.Scanner;

public class Ass4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter height in cm: ");
double height = sc.nextDouble();

System.out.print("Enter age: ");
int age = sc.nextInt();

System.out.print("Enter citizenship code (C for Endor, N for non-citizen): ");
char citizenship = sc.next().toUpperCase().charAt(0);

System.out.print("Enter recommendee code (R for recommendee, N for non-recommendee): ");
char recommendee = sc.next().toUpperCase().charAt(0);

if (recommendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
System.out.println("Status: ACCEPTED");
} else {
System.out.println("Status: REJECTED");
}
}
}
