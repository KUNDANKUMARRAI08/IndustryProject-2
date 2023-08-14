public class sumofalldigit {

    public static void main(String[] args) {
        int sum = 0;
        int num = 1245628797;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
