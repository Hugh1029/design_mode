package cn.answering.design.mode.num2.facade;

/**
 * @author zhangjp
 * @date 2020-04-30 23:40
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 外观类，这个类隐藏了创建Square, Circle等具体的细节，只提供方法给外面调用，
 * 调用的类无需关注内部怎么做的
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
