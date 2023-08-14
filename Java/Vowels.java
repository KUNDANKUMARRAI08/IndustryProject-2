import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter");
        char l = sc.next().charAt(0);
        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'A' || l == 'E' || l == 'I' || l == 'O'
                || l == 'U') {
            System.out.println("vowles");
        } else {
            System.out.println("const");
        }

    }

}
