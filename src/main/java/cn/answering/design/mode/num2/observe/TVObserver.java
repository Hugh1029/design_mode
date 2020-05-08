package cn.answering.design.mode.num2.observe;

/**
 * @author zhangjp
 * @date 2020-05-08 23:02
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TVObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("电视播放消息:" + message);
    }
}
