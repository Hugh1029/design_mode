package cn.answering.design.mode.num2.decorator.num1;

/**
 * @author zhangjp
 * @date 2020-04-29 11:53
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class Espresso implements Beverage {
    @Override
    public String description() {
        return "浓缩咖啡";
    }

    @Override
    public Integer cost() {
        return 7;
    }
}
