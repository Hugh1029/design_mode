package cn.answering.design.mode.num2.state;

/**
 * @author zhangjp
 * @date 2020-05-14 22:55
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class WaitState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("everything is wait");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "wait state";
    }
}
