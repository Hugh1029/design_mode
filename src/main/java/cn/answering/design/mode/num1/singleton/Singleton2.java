package cn.answering.design.mode.num1.singleton;

/**
 * @author zhangjp
 * @date 2020-04-14 23:34
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 线程安全的懒汉式单例模式
 * 在getInstance的方法上加上synchronized关键字来保证线程安全
 * lazy加载
 * 线程安全
 * 但是因为synchronized直接加锁的缘故，效率不高
 *
 */
public class Singleton2 {
    private static Singleton2 instance;

    /**
     * 构造方法私有化
     * 在构造方法里面增加打印，为的是看初始化时机
     *
     */
    private Singleton2() {
        System.out.println("初始化Singleton2");
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            System.out.println("即将初始化了---->");
            instance = new Singleton2();
        }
        return instance;
    }

    public void print() {
        System.out.println("I am Singleton2");
    }

    /**
     * 这即使是多线程去调用，也是线程安全的
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("main");
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Singleton2 singleton2 = Singleton2.getInstance();
                singleton2.print();
            }).start();
        }
    }
}
