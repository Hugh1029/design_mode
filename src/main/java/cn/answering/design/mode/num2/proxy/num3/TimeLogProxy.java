package cn.answering.design.mode.num2.proxy.num3;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangjp
 * @date 2020-05-07 23:30
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * cglib需要引入第三方包
 * cglib是基于ASM(一个短小精悍的字节码工具包)来实现的，性能比较高
 * cglib可以直接代理类，代理的类需要实现MethodInterceptor接口
 * cglib在初始化被代理的类的时候，其实是通过Enhancer对象把代理对象设置为被代理对象的子类
 * 也就是说，会生成一个被代理对象的子类，所以被代理的类不可以是final修饰的类
 * cglib也是在运行时候生成的
 * 注意，这和lombok没半毛钱关系，lombok是在编译的时候就完成了
 *
 *
 *
 *
 */
public class TimeLogProxy implements MethodInterceptor {

    // 目标对象(被代理的类)
    private Object target;

    public Object getProxyInstance(Object o) {
        this.target = o;
        // 工具类
        Enhancer en = new Enhancer();
        // 设置父类
        en.setSuperclass(target.getClass());
        // 设置回调函数
        en.setCallback(this);
        return en.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("开始处理------->");
        long startTime = System.currentTimeMillis();
        Object o = method.invoke(target);
        System.out.println("处理结束-------->");
        long endTime = System.currentTimeMillis();
        System.out.println("耗时--->" + (endTime - startTime));
        return o;
    }
}
