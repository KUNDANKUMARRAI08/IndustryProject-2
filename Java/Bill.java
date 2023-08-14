import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of unit");
        int unit = sc.nextInt();
        if (unit < 300) {
            System.out.println(3 * unit);
        } else if (unit <= 500) {

            System.out.println(5 * unit);
        } else if (unit > 500) {
            System.out.println(7 * unit);
        }
    }

}
