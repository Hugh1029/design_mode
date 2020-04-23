package cn.answering.design.mode.num2.adapter;

/**
 * @author zhangjp
 * @date 2020-04-23 22:48
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 这是需要适配的类
 * 手机充电的方法，无法直接使用这个类，但是只有这个类可以返回电流
 * 所以我们需要一个适配器Adapter，将Volt220保证成Volt5
 *
 */
public class Volt220 {

    public int getVolt220() {
        return 220;
    }

}
