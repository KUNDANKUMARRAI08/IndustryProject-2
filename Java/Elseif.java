import java.util.Scanner;

public class Elseif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("India Score Runs = ");
        int indScore = sc.nextInt();
        System.out.println("Aus Score Runs = ");
        int ausScore = sc.nextInt();

        if (indScore > ausScore) {
            System.out.println("inda wins !");
        }

        else if (indScore < ausScore) {
            System.out.println("aus wins!");
        } else {
            System.out.println("Draw!");
        }
    }
}