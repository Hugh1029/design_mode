package cn.answering.design.mode.num1.abstractFactory;

/**
 * @author zhangjp
 * @date 2020-04-20 23:36
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    public static void main(String[] args) {

        // 这里更好地方式可能是用另外一个类，去生产工厂；
        AbstractFactory factory1 = new HPFactory();
        Mouse mouse = factory1.createMouse();
        Keyboard keyboard = factory1.createkeyboard();
        mouse.mouse();
        keyboard.keyboard();
    }
}
