package cn.answering.design.mode.num2.state;

/**
 * @author zhangjp
 * @date 2020-05-14 22:54
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("the everything is start");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
