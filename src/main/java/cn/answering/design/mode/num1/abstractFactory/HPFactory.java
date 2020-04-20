package cn.answering.design.mode.num1.abstractFactory;

/**
 * @author zhangjp
 * @date 2020-04-20 23:28
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 具体的工厂类，继承抽象工厂
 * 生产具体的产品
 */
public class HPFactory extends AbstractFactory {

    /**
     * 惠普的工厂只生产惠普的鼠标和键盘
     * 这一点是工厂模式的特点(什么工厂生产什么东西，而不是参数去决定)
     * @return
     */
    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }

    @Override
    public Keyboard createkeyboard() {
        return new HPKeyboard();
    }
}
