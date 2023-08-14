import java.util.Scanner;

public class LargestofNnumbers {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int Largest = Integer.MIN_VALUE;

        while (i < n) {
            int num = sc.nextInt();
            // System.out.println(num);

            if (num >= Largest) {
                Largest = num;

            }
            i++;
        }
        System.out.println(Largest);
    }

}
