/**
 * CrazyModeler class
 */
public class CrazyModrler extends Modeler {

    /**
     * The function creating a doll
     *
     * @return Doll
     */
    @Override
    public Doll createDoll() {
        return new Doll() {
            @Override
            public void compose() {
                System.out.printf("Compose the doll calling %s\n", this.getName());
            }

            @Override
            public void draw() {
                System.out.printf("Draw the doll calling %s\n", this.getName());
            }

            @Override
            public void pack() {
                System.out.printf("Pack the doll calling %s\n", this.getName());
            }
        };
    }
}
