package cn.answering.design.mode.num2.proxy.num1;

/**
 * @author zhangjp
 * @date 2020-05-07 14:43
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 具体实现类
 *
 */
public class DrawPerson implements Draw {
    @Override
    public void draw() {
        System.out.println("画了一幅人物画像");
    }
}
