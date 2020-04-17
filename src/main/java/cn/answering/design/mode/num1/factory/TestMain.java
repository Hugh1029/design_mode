package cn.answering.design.mode.num1.factory;

/**
 * @author zhangjp
 * @date 2020-04-17 15:02
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");

        Shape shape2 = shapeFactory.getShape("square");
    }
}
