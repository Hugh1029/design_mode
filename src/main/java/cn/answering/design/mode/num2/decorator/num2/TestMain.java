package cn.answering.design.mode.num2.decorator.num2;

/**
 * @author zhangjp
 * @date 2020-04-29 12:24
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 *
 */
public class TestMain {

    /**
     * num1下的例子是被我修改过后的装饰器模式，不那么典型
     * 这个更加典型一些
     * 首先有被修饰的类的父类Shape, 所有的都是集成他的
     * 然后有修饰抽象类，入参是Shape，也就是Shape的所有子类都可以进来被装饰
     * 然后是抽象修饰类的具体实现类，说明了怎么去修饰shape
     * 比如这里的RedShapeDecorator，修饰所有的Shape，在drwa之后，再画一个红色的边
     * 如果有需要，我们还可以再创建一具体的修饰类，填充颜色，那么既可以是Shape的直接实现，也可以是修饰类的实现再次修饰
     * @param args
     */
    public static void main(String[] args) {
        Shape circle = new Circle();
        // circle.draw();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
    }

}
