public class ThreeDigitCodes {
    public static void main(String[] args) {

        int counter =0;

        for(int i = 1; i <= 4; i++) { // outer loop, display 1 to 4
            for(int j = 1; j <= 4; j++) {
                for(int k = 1; k <= 4; k++) {
                    // Statements to eliminate duplicates
                    if ( i != j && i != k && j != k) {
                        counter = counter + 1; // or counter++
                        System.out.println(counter + " : " + i + " "+ j  + " " + k);

                    }
                }
            }
        }

        System.out.println("We have " + counter + " unique numbers.");

    }
}