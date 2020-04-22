package cn.answering.design.mode.num1.builder.num2;

/**
 * @author zhangjp
 * @date 2020-04-22 23:38
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class MacComputerBuilder extends ComputerBuilder {
    private Computer computer;
    public MacComputerBuilder(String cpu, String memory, String disk) {
        computer = new Computer(cpu, memory, disk);
    }

    @Override
    public void setUsb() {
        computer.setUsb("3");
    }

    @Override
    public void setMouse() {
        computer.setMouse("苹果");
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("罗技");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
