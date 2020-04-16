package cn.answering.design.mode.num1.factory;

/**
 * @author zhangjp
 * @date 2020-04-16 22:45
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 这是一个父接口，所有的工厂中生产出来的类都必须实现这个接口
 * 这个接口有所有子类的都有的方法
 * 子类实现接口后可以增加自己独有的方法
 * 比如这是个形状的父类，它的子类可以是圆，四边形，三角形等
 * 他们都有draw这个方法
 */
public interface Shape {

    void draw();

}
