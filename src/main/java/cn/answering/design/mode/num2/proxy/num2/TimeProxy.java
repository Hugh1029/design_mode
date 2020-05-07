package cn.answering.design.mode.num2.proxy.num2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangjp
 * @date 2020-05-07 22:52
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 静态代理只能为一个接口服务，这样会导致出现很多很多的代理类
 * 动态代理可以通过一个代理类完成一系列的代理功能，比如时间计算功能，动态代理能为所有的实现接口的类服务
 * 动态代理是在运行时，通过反射机制实现动态代理，并且能够代理各种类型对象。
 * java实现动态代理机制，需要java.lang.reflect.InvocationHandler接口
 * 和java.lang.reflect.Proxy类的支持
 *
 * InvocationHandler接口就是invoke方法，Object invoke(Object proxy, Method method, Object[] args)
 * proxy: 被代理的对象
 * method: 要调用的方法
 * args： 调用时需要的函数
 *
 * Proxy类中药的方法是静态方法: Object newProxyInstance(ClassLoader loader, Class<?>[] interface, InvocationHandler h)
 * loader: 类加载器
 * interfaces: 得到全部的接口
 * h： 得到InvocationHandler接口的子类的实例
 *
 *
 */
public class TimeProxy implements InvocationHandler {

    // 目标对象，被代理的那个具体实例，指定后再invoke方法中使用
    private Object target;

    /**
     * 绑定关系
     * 也就是关联到那个接口(与具体的实现类绑定)的哪些方法被调用的时候，执行invoke方法
     * @param target 绑定具体的代理实例
     * @return 动态代理类的实例
     */
    public Object newProxynstance(Object target) {
        this.target = target;

        /**
         * 指定类的装载器，一组接口调用处理器生成动态代理实例
         * 第一个是产生代理对象的类加载器
         * 一组接口，只要拿到目标对象的实现接口
         * 表明这些方法被拦截后，执行哪个InvocationHandler的invoke方法(所以有人是再封装一层，这里传入一个动态的数据)
         * 返回代理对象
         */
        Object result = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
        return result;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret = null;
        try {
            long startTime = System.currentTimeMillis();
            System.out.println("开始----->");
            // 调用目标对象(被代理类的方法)
            ret = method.invoke(target, args);
            long endTime = System.currentTimeMillis();
            System.out.println("结束----->");
            System.out.println("处理时间为:" + (endTime - startTime));
        }catch (Exception e) {
            throw e;
        }
        return ret;
    }
}
