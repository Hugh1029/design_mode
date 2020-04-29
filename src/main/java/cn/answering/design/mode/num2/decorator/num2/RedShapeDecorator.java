package cn.answering.design.mode.num2.decorator.num2;

/**
 * @author zhangjp
 * @date 2020-04-29 12:21
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedborder(decoratedShape);
    }

    private void setRedborder(Shape decoratedShape) {
        System.out.println("Border color: red");
    }
}
