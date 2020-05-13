package cn.answering.design.mode.num2.template.num1;

/**
 * @author zhangjp
 * @date 2020-05-13 22:45
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 还是先以早起为例子
 * 起床、穿衣服、刷牙、洗脸、吃早饭、出门
 */
public abstract class Moring {

    public final void moring() {
        System.out.println("起床---");
        System.out.println("穿衣服---");
        System.out.println("刷牙---");
        System.out.println("洗脸---");

        haveBreakfast();

        goOut();
    }

    // 吃早饭
    protected abstract void haveBreakfast();

    // 出门
    protected abstract void goOut();
}
