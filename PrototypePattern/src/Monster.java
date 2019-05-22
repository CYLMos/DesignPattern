/**
 * Monster class
 */
public abstract class Monster implements Cloneable {

    /// Monster name
    private String name;

    /**
     * Set monster name
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get monster name
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Clone function
     *
     * @return object
     */
    @Override
    public Object clone() {
        Object object = null;

        try {
            object = super.clone();
        }
        catch (Exception e) {
            System.err.println(e);
        }

        return object;
    }
}
