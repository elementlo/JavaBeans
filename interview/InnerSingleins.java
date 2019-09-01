/**
 * InnerSingleins
 * 内部类实现多线程下单例, 即使是静态内部类, 也只会在用到的时
 */
public class InnerSingleins {

    private InnerSingleins() {
    }

    public static InnerSingleins getInnerSingleins() {
        return SingleInner.innerSingleins;
    }

    private static class SingleInner {
        public static volatile InnerSingleins innerSingleins = new InnerSingleins();
    }
}