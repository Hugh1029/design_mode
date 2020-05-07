package cn.answering.design.mode.num2.proxy.num1;

/**
 * @author zhangjp
 * @date 2020-05-07 14:45
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class DrawPersonProxy implements Draw {

    private Draw draw;

    public DrawPersonProxy(Draw draw) {
        this.draw = draw;
    }

    @Override
    public void draw() {
        long startTime = System.currentTimeMillis();
        draw.draw();
        long endTime = System.currentTimeMillis();
        System.out.println("画一幅画耗时:" + (endTime - startTime));
    }
}
