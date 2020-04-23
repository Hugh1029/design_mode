package cn.answering.design.mode.num2.adapter;

/**
 * @author zhangjp
 * @date 2020-04-23 22:58
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 不适用继承，而使用组合的方式
 * 这种方式的好处是代码更加清晰易懂一些
 */
public class VoltAdapter2 implements Volt5 {

    private Volt220 volt220;

    public VoltAdapter2(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() {
        int i = volt220.getVolt220() / 44;
        return i;
    }
}
