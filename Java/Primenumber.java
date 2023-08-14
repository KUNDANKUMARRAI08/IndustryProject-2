import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currNum = 2;

        while (currNum <= n - 1) {
            if (n % currNum == 0) {
                System.out.println("not prime!");
                break;
            }
            currNum++;
        }
        if (n == currNum) {
            System.out.println("Prime");
        }
    }

}
