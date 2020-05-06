package cn.answering.design.mode.num2.flyweight;

import java.util.HashMap;

/**
 * @author zhangjp
 * @date 2020-05-06 23:14
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 这里通过一个hashmap去存放circle，通过coloe作为key
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circlemap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circlemap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circlemap.put(color, circle);
            System.out.println("createing circle of color:" + color);
        }
        return circle;
    }
}
