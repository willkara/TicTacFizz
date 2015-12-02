public class FizzBuzzV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " FIZZ BUZZ!");
            } else if (i % 3 == 0) {
                System.out.println(i + " FIZZ!");
            } else if (i % 5 == 0) {
                System.out.println(i + " BUZZ!");
            }

        }

    }

}
