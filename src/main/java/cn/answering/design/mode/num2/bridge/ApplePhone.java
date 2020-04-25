package cn.answering.design.mode.num2.bridge;

/**
 * @author zhangjp
 * @date 2020-04-25 23:08
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class ApplePhone extends AbstractPhone {
    @Override
    public void run() {
        System.out.println("苹果手机");
        this.softList.stream().forEach(s -> s.run());
    }
}
