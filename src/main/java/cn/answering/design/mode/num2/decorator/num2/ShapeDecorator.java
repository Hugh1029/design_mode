package cn.answering.design.mode.num2.decorator.num2;

/**
 * @author zhangjp
 * @date 2020-04-29 12:20
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 装饰类的抽象类
 */
public class ShapeDecorator implements Shape {

    // 被修饰的类
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
