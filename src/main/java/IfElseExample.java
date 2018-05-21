import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        double score;
        score = sc.nextDouble();

        if (score >= 8.5)
            System.out.print("Grade A");
        else if (score >= 7.0)
            System.out.print("Grade B");
        else if (score >=5)
            System.out.print("Grade C");
        else
            System.out.print("Grade D");
    }
}
