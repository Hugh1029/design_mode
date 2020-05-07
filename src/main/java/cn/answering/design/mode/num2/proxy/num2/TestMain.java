package cn.answering.design.mode.num2.proxy.num2;

/**
 * @author zhangjp
 * @date 2020-05-07 22:58
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 这样不管是什么类，只要是做时间统计的都可以通过代理类来完成
 * 比如日志、事务、拦截器等都可以做
 * 著名的面向切面编程(AOP),核心就是动态代理
 * 但是有一个缺点，就是被代理的类必须是实现接口的才能被代理
 * 那么普通的类怎么办呢？
 * 有了第三种，cglib
 */
public class TestMain {

    public static void main(String[] args) {
        TimeProxy proxy = new TimeProxy();
        Animal animal = (Animal) proxy.newProxynstance(new Dog());
        animal.run();

        Vehicle vehicle = (Vehicle) proxy.newProxynstance(new Car());
        vehicle.drive();

    }
}
