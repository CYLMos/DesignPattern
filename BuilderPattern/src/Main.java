/**
 * Main class
 */
public class Main {

    public static void main(String [] argv) {
        PieDirector pieDirector = new PieDirector();

        /// Create the apple pie
        pieDirector.setPieBuilder(new ApplePieBuilder());
        pieDirector.contructPie();

        /// Create the banana pie first
        pieDirector.setPieBuilder(new BananaPieBuilder());
        pieDirector.contructPie();
    }
}
