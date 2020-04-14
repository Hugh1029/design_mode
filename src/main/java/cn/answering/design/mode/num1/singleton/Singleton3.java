package cn.answering.design.mode.num1.singleton;

/**
 * @author zhangjp
 * @date 2020-04-14 23:40
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 饿汉式
 * 非lazy初始化
 * 多线程安全
 * 实现很简单
 *
 * 这种情况就是简单的用静态变量去实现，类加载的时候就已经初始化了
 *
 *
 */
public class Singleton3 {
    private static Singleton3 singleton3 = new Singleton3();
    private Singleton3() {
        System.out.println("初始化singleton3");
    }

    public static Singleton3 getInstance() {
        return singleton3;
    }

    public void print() {
        System.out.println("i am singleton3");
    }

    /**
     * 可以看到初始化的时间在main之前
     * 加载的时候就初始化了
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("main");
        int i = 50;
        while (i > 0) {
            new Thread(() -> {
                Singleton3 singleton3 = Singleton3.getInstance();
                singleton3.print();
            }).start();
            i--;
        }
    }
}
