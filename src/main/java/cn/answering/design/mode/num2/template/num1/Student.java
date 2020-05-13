package cn.answering.design.mode.num2.template.num1;

/**
 * @author zhangjp
 * @date 2020-05-13 22:47
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 学生吃的比较营养均衡，面包+牛奶
 * 出门去上学
 */
public class Student extends Moring {
    @Override
    protected void haveBreakfast() {
        System.out.println("吃早饭，吃面包+牛奶");
    }

    @Override
    protected void goOut() {
        System.out.println("出门去上学");
    }
}
