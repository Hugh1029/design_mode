package cn.answering.design.mode.num2.filter.num2;

import cn.answering.design.mode.num2.filter.num1.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjp
 * @date 2020-04-26 12:30
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class PersonFilter {

    List<Person> filter(List<Person> list, Filter<Person> filter) {
        List<Person> l = new ArrayList<>();
        for (Person person : list) {
            if (filter.test(person)) {
                l.add(person);
            }
        }
        return l;
    }
}
