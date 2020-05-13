package cn.answering.design.mode.num2.template.num1;

/**
 * @author zhangjp
 * @date 2020-05-13 22:50
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 程序员吃了包子+豆浆
 * 去办公室写代码
 */
public class Programmer extends Moring {
    @Override
    protected void haveBreakfast() {
        System.out.println("吃了包子和豆浆");
    }

    @Override
    protected void goOut() {
        System.out.println("去办公室写代码");
    }
}
