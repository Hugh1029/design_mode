package cn.answering.design.mode.num2.observe;

/**
 * @author zhangjp
 * @date 2020-05-08 22:30
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 主题，说的更直白一点，就是被观察者
 *
 */
public interface Subject {

    void addObserver(Observer observer);

    void removerObserver(Observer observer);

    void inform(String message);
}
