package cn.answering.design.mode.num2.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangjp
 * @date 2020-05-09 23:59
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class President implements Mediator {

    private Map<String, Deparment> map = new HashMap<>();

    @Override
    public void register(String dname, Deparment deparment) {
        map.put(dname, deparment);
    }

    @Override
    public void command(String dname) {
        System.out.println("执行前---->");
        map.get(dname).selfAction();
        System.out.println("执行后---->");
    }
}
