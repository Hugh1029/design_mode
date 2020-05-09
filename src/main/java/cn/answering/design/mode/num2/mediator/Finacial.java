package cn.answering.design.mode.num2.mediator;

/**
 * @author zhangjp
 * @date 2020-05-09 23:51
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 具体的同事类
 */
public class Finacial implements Deparment {

    private Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("管理财务资金流向----");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，财务情况---");
    }
}
