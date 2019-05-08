/**
 * Main class
 */
public class Main {

    /**
     * Main function
     * @param argv Arguments
     */
    public static void main(String [] argv) {
        Modeler modeler = new CrazyModrler();

        modeler.compose("Velvet");
        modeler.compose("Mash");

        System.out.println();
        modeler.draw();

        System.out.println();
        modeler.pack();
    }
}
