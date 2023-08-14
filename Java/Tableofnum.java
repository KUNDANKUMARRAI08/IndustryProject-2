import java.util.Scanner;

public class Tableofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int table = 0;
        int i = 1;
        do {
            table = n * i;
            System.out.println(table);
            i++;
        } while (i <= 10);

    }

}
