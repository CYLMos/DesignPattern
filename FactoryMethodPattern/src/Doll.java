/**
 * Doll class
 */
public abstract class Doll {

    /// Doll name
    private String name;

    /**
     * Get the doo name
     *
     * @return Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the doll name
     *
     * @param name Name
     */
    public void setId(String name) {
        this.name = name;
    }

    public abstract void compose();

    public abstract void draw();

    public abstract void pack();
}
