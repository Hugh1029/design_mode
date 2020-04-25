package cn.answering.design.mode.num2.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjp
 * @date 2020-04-25 20:29
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 手机抽象类，每个具体的手机类都必须实现这个类
 * 一个手机可以有任意多个软件，根据需要添加。
 *
 */
public abstract class AbstractPhone {

    protected List<AbstractSoft> softList = new ArrayList<>();

    public void addSoft(AbstractSoft soft) {
        this.softList.add(soft);
    }

    public abstract void run();
}
