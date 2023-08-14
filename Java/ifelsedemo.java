public class ifelsedemo {
    public static void main(String[] args) {
        int indScore = 350;
        int ausScore = 350;

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
