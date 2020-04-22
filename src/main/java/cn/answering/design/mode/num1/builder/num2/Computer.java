package cn.answering.design.mode.num1.builder.num2;

/**
 * @author zhangjp
 * @date 2020-04-22 23:33
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class Computer {
    private String cpu; // 必选
    private String memory; // 必选
    private String disk; // 必选
    private String usb; // 可选
    private String mouse; // 可选
    private String keyboard; // 可选

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
