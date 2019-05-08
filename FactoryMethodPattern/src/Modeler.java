import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Modeler class
 */
public abstract class Modeler {

    /// The list of dolls
    private List<Doll> dolls = new ArrayList<>();

    /**
     * Composing function
     *
     * @param name Doll name
     * @return Doll
     */
    public Doll compose(String name) {
        Doll doll = this.createDoll();
        doll.setId(name);
        doll.compose();

        this.dolls.add(doll);

        return doll;
    }

    /**
     * Drawing function
     *
     * @param doll Doll
     */
    public void draw(Doll doll) {
        doll.draw();
    }

    /**
     * Drawing function
     */
    public void draw() {
        for (Doll doll : this.dolls) {
            doll.draw();
        }
    }

    /**
     * Packing function
     *
     * @param doll Doll
     */
    public void pack(Doll doll) {
        doll.pack();

        this.dolls.remove(doll);
        System.out.printf("%s has been removed\n", doll.getName());
    }

    /**
     * Packing function
     */
    public void pack() {
        for (Iterator<Doll> it = this.dolls.iterator(); it.hasNext();) {
            Doll doll = it.next();
            doll.pack();

            it.remove();
            System.out.printf("%s has been removed\n", doll.getName());
        }
    }

    /**
     * The function creating a doll
     *
     * @return Doll
     */
    public abstract Doll createDoll();
}
