package cn.answering.design.mode.num1.abstractFactory;

/**
 * @author zhangjp
 * @date 2020-04-20 23:33
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class DellFactory extends AbstractFactory {

    /**
     * 戴尔的工厂只生产和戴尔相关的东西
     * @return
     */
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createkeyboard() {
        return new DellKeyboard();
    }
}
