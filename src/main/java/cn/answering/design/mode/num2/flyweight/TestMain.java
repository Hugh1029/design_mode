package cn.answering.design.mode.num2.flyweight;

/**
 * @author zhangjp
 * @date 2020-05-06 23:18
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 通过享元模式，可以看出，尽管有20个对象，但是仅仅只是每个颜色创建了一个
 * 这样就大大的降低了内存消耗
 */
public class TestMain {
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomNum());
            circle.setY(getRandomNum());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }

    private static int getRandomNum() {
        return (int)(Math.random() * 100);
    }
}
