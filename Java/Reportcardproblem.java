import java.util.Scanner;

public class Reportcardproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Marks Score by Student");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("A+ garde");
        } else if (marks >= 80) {
            System.out.println("A garde");
        } else if (marks >= 70) {
            System.out.println("B garde");
        } else if (marks >= 60) {
            System.out.println("c garde");
        } else {
            System.out.println("fail");
        }

    }

}
