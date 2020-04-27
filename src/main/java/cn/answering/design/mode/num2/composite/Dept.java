package cn.answering.design.mode.num2.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjp
 * @date 2020-04-27 23:03
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 *
 * 部门类，每个公司由多个部门组成
 * 每个部门多个人组成
 * 当然部门也可以抽象一个接口出来，让所有的部门都实现这个接口
 * 这种情况是细化部门的时候，比如具体做什么等，可以这么做
 */
public class Dept {

    private String deptName;
    private List<Employee> list = new ArrayList<>();

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee(Employee e) {
        this.list.add(e);
    }

    public void deleteEmployee(Employee e) {
        this.list.remove(e);
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                ", list=" + list +
                '}';
    }
}
