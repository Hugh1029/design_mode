package cn.answering.design.mode.num2.mediator;

/**
 * @author zhangjp
 * @date 2020-05-09 23:50
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 抽象中介者类--经理
 */
public interface Mediator {

    void register(String dname, Deparment deparment);

    void command(String dname);

}
