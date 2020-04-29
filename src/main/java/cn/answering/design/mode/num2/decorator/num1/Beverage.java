package cn.answering.design.mode.num2.decorator.num1;

/**
 * @author zhangjp
 * @date 2020-04-29 11:38
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 饮料的最基础类
 * 咖啡、加的料都实现这个接口
 *
 */
public interface Beverage {

    /**
     * 饮料描述
     * @return
     */
    String description();

    /**
     * 价格，以分为单位
     * @return
     */
    Integer cost();


}
