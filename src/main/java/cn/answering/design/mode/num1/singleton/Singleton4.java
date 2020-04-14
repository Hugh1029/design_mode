package cn.answering.design.mode.num1.singleton;

/**
 * @author zhangjp
 * @date 2020-04-14 23:46
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 双检索/双重校验锁
 * 这边利用volatile去修饰静态变量，让所有进程在读取的时候
 * 初始化的值会第一时间写入主存，而其他进程会发现自己缓存的值失效了
 * 然后重写读取，从而保证不会重复初始化
 *
 * 而同时，实例化的部分，用synchronized修饰着
 * 但是只会执行一次，不会影响效率
 *
 * lazy: 是
 * 线程安全： 是
 *
 */
public class Singleton4 {
    private volatile static Singleton4 singleton4;

    private Singleton4() {
        System.out.println("init singleton4");
    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    System.out.println("即将实例化");
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }

    public void print() {
        System.out.println("I am singleton4");
    }

    /**
     * 即将实例化和init只会打印一次
     * 线程安全的，而且加锁的方法也只是执行一次，效率就不低了
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("main");
        int i = 50;
        while (i > 0) {
            new Thread(() -> {
                Singleton4 singleton4 = Singleton4.getInstance();
                singleton4.print();
            }).start();
            i--;
        }
    }

}
