package cn.answering.design.mode.num2.mediator;

/**
 * @author zhangjp
 * @date 2020-05-09 23:49
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 抽象同事类
 *
 */
public interface Deparment {

    // 做自己的事
    void selfAction();

    // 向总经理发出申请
    void outAction();
}
