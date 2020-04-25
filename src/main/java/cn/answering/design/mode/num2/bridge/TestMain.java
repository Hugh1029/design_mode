package cn.answering.design.mode.num2.bridge;

/**
 * @author zhangjp
 * @date 2020-04-25 23:10
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    /**
     * 这样不管是添加新的手机类型还是添加新的软件，都不需要在修改以前的代码
     * 只要实现对应的接口就可以
     * 将手机和软件相互拆开，使用组合的方式
     * 降低了耦合度
     * @param args
     */
    public static void main(String[] args) {
        SungPhone sungPhone = new SungPhone();
        sungPhone.addSoft(new MusicSoft());
        sungPhone.addSoft(new VideoSoft());
        sungPhone.run();

        ApplePhone applePhone = new ApplePhone();
        applePhone.addSoft(new MusicSoft());
        applePhone.run();
    }
}
