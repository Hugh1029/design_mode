package cn.answering.design.mode.num1.singleton;

/**
 * @author zhangjp
 * @date 2020-04-14 23:21
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 单例模式的第一种实现方式： 懒汉式
 * lazy初始化
 * 线程不安全
 * 实现简单
 *
 */
public class Singleton1 {

    private static Singleton1 instance;

    /**
     * 构造方法私有化
     * 在构造方法里面增加打印，为的是看初始化时机
     *
     */
    private Singleton1() {
        System.out.println("初始化Singleton1");
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            System.out.println("即将初始化了---->");
            instance = new Singleton1();
        }
        return instance;
    }

    public void print() {
        System.out.println("I am Singleton");
    }

    /**
     * 在这里，我们将getInstance()放在多个线程中去启动
     * 会发现初始化Singleton1不止打印一次
     * 这就是线程不安全，在多个线程抢占的时候，出现了问题
     * 如果只是放在for循环的单线程中，那么就不会有这种现象
     *
     * 此外，可以看到知道调用getInstance的时候才会初始化
     * 是lazy加载的
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("main");
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Singleton1 singleton1 = Singleton1.getInstance();
                singleton1.print();
            }).start();
        }
    }

}
