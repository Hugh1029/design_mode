package cn.answering.design.mode.num2.decorator.num1;

/**
 * @author zhangjp
 * @date 2020-04-29 12:04
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    /**
     * 加入我现在需要一杯浓缩咖啡+奶泡+摩卡
     * 像下面这样就行了，但是好像还是不够好，如果能想构造者模式那样，形成一个链条就更好了
     * 可以进行一个简单的改造，增加一个add方法
     * @param args
     */
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Whip whip = new Whip(espresso);
        Mocha mocha = new Mocha(whip);
        System.out.println(mocha.description());
        System.out.println(mocha.cost());
    }
}
