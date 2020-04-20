package cn.answering.design.mode.num1.abstractFactory;

/**
 * @author zhangjp
 * @date 2020-04-20 23:01
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 为Color和Shape对象穿件抽象类来获取工厂
 *
 */
public abstract class AbstractFactory {

    public abstract Mouse createMouse();

    public abstract Keyboard createkeyboard();

}
