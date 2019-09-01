class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
    };

    public static Singleton singleIns() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}