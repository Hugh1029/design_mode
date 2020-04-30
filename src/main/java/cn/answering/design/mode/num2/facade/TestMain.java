package cn.answering.design.mode.num2.facade;

/**
 * @author zhangjp
 * @date 2020-04-30 23:44
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        // 要干什么只要通过这个外观类来做了
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
