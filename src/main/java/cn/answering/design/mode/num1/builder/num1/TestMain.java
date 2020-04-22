package cn.answering.design.mode.num1.builder.num1;

/**
 * @author zhangjp
 * @date 2020-04-22 23:17
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder("因特尔", "三星", "华硕")
                .setKeyboard("罗技")
                .setMouse("苹果")
                .build();
    }
}
