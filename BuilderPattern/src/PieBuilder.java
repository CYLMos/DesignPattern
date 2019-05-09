/**
 * PieBuilder class
 */
public abstract class PieBuilder {

    /// Pie
    protected Pie pie;

    /**
     * Get the pie
     *
     * @return  Pie
     */
    public Pie getPie() {
        return this.pie;
    }

    /**
     * Create a pie.
     */
    public void createNewPie() {
        this.pie = new Pie();
    }

    /**
     * Show the information of the pie
     */
    public void showPieMessage() {
        System.out.printf("Dough: %s, Topping: %s\n", this.pie.getDough(), this.pie.getTopping());
    }

    public abstract void buildDough();

    public abstract void buildTopping();
}
