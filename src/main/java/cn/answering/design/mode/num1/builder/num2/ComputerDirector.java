package cn.answering.design.mode.num1.builder.num2;

/**
 * @author zhangjp
 * @date 2020-04-22 23:41
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 指导者类
 **/
public class ComputerDirector {

    public void makeComputer(ComputerBuilder builder) {
        builder.setKeyboard();
        builder.setUsb();
        builder.setMouse();
    }

}
