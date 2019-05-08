/**
 * Main class
 */
public class Main {

    /**
     * Main function
     *
     * @param argv Arguments
     */
    public static void main (String [] argv) {
        /**
         * Singleton singleton = new Singleton(System.currentTimeMillis())
         * It's not allowed because the constructor of Singleton is private
         */
        Singleton singleton1 = Singleton.getInstance();
        System.out.printf("The created time of singleton1: %d\n", singleton1.getCreatedTime());

        Singleton singleton2 = Singleton.getInstance();
        System.out.printf("The created time of singleton2: %d\n", singleton2.getCreatedTime());

        System.out.println();

        /// Check whether singleton1 and singleton2 are the same object or not
        if (singleton1 == singleton2) {
            System.out.printf("singleton1 and singleton2 are the same object.\n");
        }
        else {
            System.out.printf("singleton1 and singleton2 are not the same object.\n");
        }
    }
}
