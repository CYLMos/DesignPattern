/**
 * Main class
 */
public class Main {

    public static void main(String [] argv) {
        Monster godzilla1 = new Godzilla();
        Monster godzilla2 = (Godzilla) godzilla1.clone();

        System.out.printf("godzilla1 name : %s\n", godzilla1.getName());
        System.out.printf("godzilla1 hash code : %d\n", godzilla1.hashCode());

        System.out.printf("godzilla2 name : %s\n", godzilla2.getName());
        System.out.printf("godzilla2 hash code : %d\n", godzilla2.hashCode());
    }
}
