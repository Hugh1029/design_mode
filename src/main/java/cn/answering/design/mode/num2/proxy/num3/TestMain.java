package cn.answering.design.mode.num2.proxy.num3;

/**
 * @author zhangjp
 * @date 2020-05-07 23:35
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 
 *
 */
public class TestMain {



    public static void main(String[] args) {
        TimeLogProxy proxy = new TimeLogProxy();
        WorkService workService = (WorkService) proxy.getProxyInstance(new WorkService());
        workService.processLog();
        workService.writeFile();
    }


}
