package cn.answering.design.mode.num2.composite;

/**
 * @author zhangjp
 * @date 2020-04-27 23:11
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    public static void main(String[] args) {
        Company company = new Company("你好公司", "大仲马街道", "02588213", "TX0012344");
        Dept dept = new Dept();
        dept.setDeptName("研发部");

        Employee employee = new Employee("王大锤", "经理", "12345632", 28);

        dept.addEmployee(employee);

        company.addDept(dept);

        System.out.println(company);


    }
}
