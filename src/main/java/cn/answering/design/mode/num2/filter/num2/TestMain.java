package cn.answering.design.mode.num2.filter.num2;

import cn.answering.design.mode.num2.filter.num1.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangjp
 * @date 2020-04-26 12:32
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person());

        List<Person> list = new PersonFilter().filter(personList, p -> p.getAge() <= 14);

        // java8的filter
        personList.stream().filter(person -> person.getAge() <= 14).collect(Collectors.toList());

    }
}
