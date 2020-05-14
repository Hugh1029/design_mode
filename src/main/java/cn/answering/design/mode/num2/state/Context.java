package cn.answering.design.mode.num2.state;

/**
 * @author zhangjp
 * @date 2020-05-14 22:52
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }


}
