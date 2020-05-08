package cn.answering.design.mode.num2.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjp
 * @date 2020-05-08 22:37
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 消息中心：
 * 这个消息中心每天会有最新的一手消息
 * 订阅它的的机构就会得到这个消息
 * 然后播放到报纸、电台、电视等
 *
 */
public class MessageData implements Subject {

    private List<Observer> list = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void inform(String message) {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    public void productMessage(String message) {
        this.inform(message);
    }
}
