package cn.answering.design.mode.num2.proxy.num3;

import java.util.concurrent.TimeUnit;

/**
 * @author zhangjp
 * @date 2020-05-07 23:25
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 假设我们有一个工具类，这个工具类中做了很多重要的耗时操作
 * (或者可以简单的说一个Controller，每个请求过来，都要统计处理时间)
 *
 * 我们需要统计每个操作的处理时间
 * 因为是类，没有实现接口，所以动态代理就用不了
 * 可以通过CGLIB来实现
 *
 */
public class WorkService {

    public void writeFile() {
        System.out.println("写入文件中....很耗时....");
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void processLog() {
        System.out.println("处理日志文件中....很耗时....");
        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
