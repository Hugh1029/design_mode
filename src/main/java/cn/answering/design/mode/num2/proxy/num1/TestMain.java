package cn.answering.design.mode.num2.proxy.num1;

/**
 * @author zhangjp
 * @date 2020-05-07 14:51
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 这是典型的静态代理
 * 优点是不用修改DrawPerson的内容，可以通过代理类，扩展功能
 * 缺点是如果接口发生变化，那么代理类就要变化；
 * 而且如果类太多，那么代理类就会非常多
 */
public class TestMain {

    public static void main(String[] args) {
        DrawPerson drawPerson = new DrawPerson();
        DrawPersonProxy personProxy = new DrawPersonProxy(drawPerson);
        personProxy.draw();
    }
}
