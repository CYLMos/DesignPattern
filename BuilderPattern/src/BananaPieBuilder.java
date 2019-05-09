/**
 * BananaPieBuilder class
 */
public class BananaPieBuilder extends PieBuilder {
    @Override
    public void buildDough() {
        this.pie.setDough("Silver dough");
    }

    @Override
    public void buildTopping() {
        this.pie.setTopping("Banana");
    }
}
