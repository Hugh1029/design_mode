package cn.answering.design.mode.num2.observe;

/**
 * @author zhangjp
 * @date 2020-05-08 23:04
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class NewsPaperObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("报纸刊登新消息:" + message);
    }
}
