package cn.answering.design.mode.num1.singleton;

/**
 * @author zhangjp
 * @date 2020-04-15 00:02
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 静态内部类，这种实现方式简单
 * 线程安全并且是lazy加载
 * 推荐这种方式去实现
 */
public class Singleton5 {

    private static class SingletonHolder {

        private SingletonHolder() {
            System.out.println("现在我被初始化了");
        }

        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
        System.out.println("init singleton5");
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void print() {
        System.out.println("this is single5");
    }

    public static void main(String[] args) {
        System.out.println("main");
        int i = 50;
        while (i-- > 0) {
            new Thread(() -> {
                Singleton5 singleton5 = Singleton5.getInstance();
                singleton5.print();
            }).start();
        }
    }
}
