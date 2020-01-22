/**
 *
 * @author Cordelle Walden
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        movies[] test = new movies[7];
        for (int i = 0; i < test.length; i++) {
            test[i] = new movies();
            test[i].makeMovie();
        }
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i].movie);
            System.out.println("ABC 123 ");
            
        }
    }
}
