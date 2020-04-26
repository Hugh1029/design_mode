package cn.answering.design.mode.num2.filter.num2;

/**
 * @author zhangjp
 * @date 2020-04-26 12:29
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 *
 * 函数式接口，用于判断是否符合条件
 */
public interface Filter<T> {

    boolean test(T t);
}
