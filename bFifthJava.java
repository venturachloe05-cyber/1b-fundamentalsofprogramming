import java.util.Scanner;

public class bFifthJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        
        String msg = "Hello " + name + "!";
        System.out.println(msg);
    }
}
