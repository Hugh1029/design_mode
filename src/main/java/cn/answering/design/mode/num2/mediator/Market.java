package cn.answering.design.mode.num2.mediator;

/**
 * @author zhangjp
 * @date 2020-05-09 23:56
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 市场部同事
 */
public class Market implements Deparment {

    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("汇报情况，项目需要资金支持");
        // 通过调用中介者去调用同事类，不会直接和同事类耦合
        mediator.command("finacial");
    }

    @Override
    public void outAction() {
        System.out.println("谈项目计划");
    }
}
