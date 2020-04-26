package cn.answering.design.mode.num2.filter.num1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjp
 * @date 2020-04-26 12:26
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class ChildrenFilter implements Filter {
    @Override
    public List<Person> filter(List<Person> people) {
        List<Person> list = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() < 14) {
                list.add(person);
            }
        }
        return list;
    }
}
