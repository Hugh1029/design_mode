package cn.answering.design.mode.num2.adapter;

/**
 * @author zhangjp
 * @date 2020-04-23 22:53
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 这是一个适配器类，负责将Volt220转为手机需要的Volt5
 * 适配器要做的是继承原来的类，然后实现需要适配的接口
 */
public class VoltAdapter extends Volt220 implements Volt5 {

    @Override
    public int getVolt5() {
        int i = super.getVolt220() / 44;
        return i;
    }
}
