package cn.answering.design.mode.num1.singleton;

/**
 * @author zhangjp
 * @date 2020-04-15 00:21
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class Singleton6 {

    public Singleton6() {
        System.out.println("init singlrton6");
    }

    public void print() {
        System.out.println("i am single6");
    }

    public static void main(String[] args) {
        System.out.println("main");
        int i = 50;
        while (i-- > 0) {
            new Thread(() -> {
                Singleton6 singleton6 = SingletonEnum.INSTANCE.getInstance();
                singleton6.print();
            }).start();
        }
    }
}
