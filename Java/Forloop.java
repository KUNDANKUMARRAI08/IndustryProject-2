public class Forloop {
    public static void main(String[] args) {
        int edge = 5;
        // int cp = 0; /* with the help of this value van print outside the loop */
        for (int cp = 0; cp < edge; cp++) {
            System.out.println(cp);
        }
        System.out.println(cp); /* this will give a error because cp intialize in loop */
    }

}
