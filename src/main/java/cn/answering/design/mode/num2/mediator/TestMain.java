package cn.answering.design.mode.num2.mediator;

/**
 * @author zhangjp
 * @date 2020-05-10 00:01
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 通俗的来说中介者模式，就好比买卖房屋或者东西一样
 * 不管是买方还是卖方，你买卖的是商品房还是住宅还是别墅，你只需要跟中介去打交道
 * 所以你的手机里的联系方式只有中介
 * 卖方： 我决定100W卖掉我这套房，告诉中介(通过中介者通知到买方)
 * 买方: 太贵了，我只能花90W（通过中介者告诉卖方）
 * 卖方： 成交
 * 整个过程，都没有卖方和买方直接去沟通。放到类关系里，整个过程，这两个类之间从来没有过相互调用
 * 而是通过将中介类引入到自己的类里，通过中介类去告诉另外的同事类
 * 这样虽然同事类之间相互没有耦合了，但是随着同事类增多，那么中介类会变得很复杂
 *
 */
public class TestMain {

    public static void main(String[] args) {
        Mediator mediator = new President();

        Market market = new Market(mediator);
        Finacial finacial = new Finacial(mediator);

        market.selfAction();
        market.outAction();
    }
}
