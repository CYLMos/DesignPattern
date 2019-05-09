public class PieDirector {

    /// Pie builder
    private PieBuilder pieBuilder;

    /**
     * Set the builder
     * @param pieBuilder    PieBuilder
     */
    public void setPieBuilder(PieBuilder pieBuilder) {
        this.pieBuilder = pieBuilder;
    }

    /**
     * Get the pie
     *
     * @return  Pie
     */
    public Pie getPie() {
        return this.pieBuilder.getPie();
    }

    /**
     * Construct the pie
     */
    public void contructPie() {
        this.pieBuilder.createNewPie();
        this.pieBuilder.buildDough();
        this.pieBuilder.buildTopping();
        this.pieBuilder.showPieMessage();
    }
}
