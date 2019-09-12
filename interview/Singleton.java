//写一个单列模式
// class Singleton {
//     private static volatile Singleton singleton;

//     private Singleton() {
//     };

//     public static Singleton singleIns() {
//         if (singleton == null) {
//             synchronized (Singleton.class) {
//                 if (singleton == null) {
//                     singleton = new Singleton();
//                 }
//             }
//         }
//         return singleton;
//     }
// }

/**
 * InnerSingleton 内部类方式实现单例
 */
public class Singleton {
    public static void main(String[] args) {
        
    }

    static class SingleIns {
        private SingleIns() {
        }

        public static SingleIns getIns() {
            return InnerSingleton.INS;
        }

        /**
         * InnerSingleton
         */
        private static class InnerSingleton {

            private static volatile SingleIns INS = new SingleIns();
        }
    }
}