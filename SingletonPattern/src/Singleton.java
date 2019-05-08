/**
 * Singleton class
 */
public class Singleton {

    /// Instance
    private static Singleton instance = null;

    /// Created time of the instance
    private long createdTime;

    /**
     * Constructor
     */
    private Singleton(long createTime) {
        this.createdTime = createTime;
    }

    /**
     * Get the instance
     *
     * @return Instance
     */
    public static Singleton getInstance() {
        /// Check the instance is null or not
        if (instance == null) {
            synchronized (Singleton.class) {
                /// Double-check
                if (instance == null) {
                    instance = new Singleton(System.currentTimeMillis());
                }
            }
        }

        return instance;
    }

    /**
     * Get the created time of the instance
     *
     * @return The created time of the instance
     */
    public long getCreatedTime() {
        return this.createdTime;
    }
}
