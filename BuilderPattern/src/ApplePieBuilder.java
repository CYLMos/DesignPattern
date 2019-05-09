/**
 * ApplePieBuilder class
 */
public class ApplePieBuilder extends PieBuilder {
    @Override
    public void buildDough() {
        this.pie.setDough("Golden dough");
    }

    @Override
    public void buildTopping() {
        this.pie.setTopping("Apple");
    }
}
