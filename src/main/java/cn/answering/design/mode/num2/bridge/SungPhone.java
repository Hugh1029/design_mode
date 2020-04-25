package cn.answering.design.mode.num2.bridge;

/**
 * @author zhangjp
 * @date 2020-04-25 23:05
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class SungPhone extends AbstractPhone {

    @Override
    public void run() {
        System.out.println("三星手机");
        softList.stream().forEach(s -> s.run());
    }
}
