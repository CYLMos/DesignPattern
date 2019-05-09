/**
 * Pie
 */
public class Pie {

    /// Dough
    private String dough;

    /// Topping
    private String topping;

    /**
     * Constructor
     */
    public Pie() {

    }

    /**
     * Constructor
     *
     * @param dough     Dough
     * @param topping   Topping
     */
    public Pie(String dough, String topping) {
        this.dough = dough;
        this.topping = topping;
    }

    /**
     * Set the dough of the pie
     * @param dough Dough
     */
    public void setDough(String dough) {
        this.dough = dough;
    }

    /**
     * Get the dough of th pie
     *
     * @return  Dough
     */
    public String getDough() {
        return this.dough;
    }

    /**
     * Set the topping of the pie
     *
     * @param topping Topping
     */
    public void setTopping(String topping) {
        this.topping = topping;
    }

    /**
     * Get the topping of th pie
     *
     * @return  Topping
     */
    public String getTopping() {
        return this.topping;
    }
}
