package cn.answering.design.mode.num1.factory;

/**
 * @author zhangjp
 * @date 2020-04-16 22:51
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 这里是生产对象的工厂
 * 所有的shape的子类都在这里被生产出来
 * 也可以利用工厂模式进行单例模式
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }else if ("rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }else if ("square".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
