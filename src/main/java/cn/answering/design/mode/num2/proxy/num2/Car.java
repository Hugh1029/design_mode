package cn.answering.design.mode.num2.proxy.num2;

/**
 * @author zhangjp
 * @date 2020-05-07 22:46
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("i am car ,100KM/H");
    }
}
