package cn.answering.design.mode.num1.builder.num1;

/**
 * @author zhangjp
 * @date 2020-04-22 22:05
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 我们以配置一台电脑为例子
 * 假设我们配置一台电脑需要:
 * cpu 必须要
 * 内存 必须要
 * 硬盘必须要
 * usb 不一定要
 * 鼠标 不一定要
 * 外接键盘不一定要
 *
 */
public class Computer {

    private String cpu; // 必选
    private String memory; // 必选
    private String disk; // 必选
    private String usb; // 可选
    private String mouse; // 可选
    private String keyboard; // 可选

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.disk = builder.disk;
        this.usb = builder.usb;
        this.mouse = builder.mouse;
        this.keyboard = builder.keyboard;
    }

    public static class Builder {
        private String cpu;
        private String memory;
        private String disk;
        private String usb;
        private String mouse;
        private String keyboard;

        public Builder(String cpu, String memory, String disk) {
            this.cpu = cpu;
            this.memory = memory;
            this.disk = disk;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Builder setUsb(String usb) {
            this.usb = usb;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }




}
