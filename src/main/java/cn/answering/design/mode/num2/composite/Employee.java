package cn.answering.design.mode.num2.composite;

/**
 * @author zhangjp
 * @date 2020-04-27 23:07
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class Employee {

    private String name;
    private String position;
    private String phone;
    private int age;

    public Employee(String name, String position, String phone, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emplyee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
