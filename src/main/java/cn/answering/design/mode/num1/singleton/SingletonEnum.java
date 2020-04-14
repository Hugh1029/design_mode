package cn.answering.design.mode.num1.singleton;

/**
 * @author zhangjp
 * @date 2020-04-15 00:22
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public enum  SingletonEnum {

    INSTANCE;
    private Singleton6 instance;

    SingletonEnum() {
        instance = new Singleton6();
    }

    public Singleton6 getInstance() {
        return instance;
    }

}
