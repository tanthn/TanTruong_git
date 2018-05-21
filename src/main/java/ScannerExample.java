import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name;
        name = sc.nextLine();
        System.out.print("Hello " + name);
    }
}
