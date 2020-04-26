package cn.answering.design.mode.num2.filter.num1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjp
 * @date 2020-04-26 12:28
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    public static void main(String[] args) {
        List<Person> childrens = new ChildrenFilter().filter(new ArrayList<>());
    }
}
