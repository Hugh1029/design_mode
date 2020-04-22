package cn.answering.design.mode.num1.builder.num2;

/**
 * @author zhangjp
 * @date 2020-04-22 23:36
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public abstract class ComputerBuilder {
    public abstract void setUsb();


    public abstract void setMouse();

    public abstract void setKeyboard();

    public abstract Computer getComputer();
}
