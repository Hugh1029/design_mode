package cn.answering.design.mode.num2.template.num1;

/**
 * @author zhangjp
 * @date 2020-05-13 22:49
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 工人吃的比较简单，面条
 * 出门去工地
 */
public class Worker extends Moring {
    @Override
    protected void haveBreakfast() {
        System.out.println("吃了面条，吃饱了就行");
    }

    @Override
    protected void goOut() {
        System.out.println("去工地干活");
    }
}
