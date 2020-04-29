package cn.answering.design.mode.num2.decorator.num1;

/**
 * @author zhangjp
 * @date 2020-04-29 11:41
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 深焙咖啡
 */
public class DarkRoast implements Beverage {
    @Override
    public String description() {
        return "深焙咖啡";
    }

    @Override
    public Integer cost() {
        return 5;
    }
}
