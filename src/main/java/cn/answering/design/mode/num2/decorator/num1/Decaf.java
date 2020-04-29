package cn.answering.design.mode.num2.decorator.num1;

/**
 * @author zhangjp
 * @date 2020-04-29 11:52
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class Decaf implements Beverage {
    @Override
    public String description() {
        return "低咖啡因咖啡";
    }

    @Override
    public Integer cost() {
        return 6;
    }
}
