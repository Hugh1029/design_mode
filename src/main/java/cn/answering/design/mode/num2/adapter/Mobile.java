package cn.answering.design.mode.num2.adapter;

/**
 * @author zhangjp
 * @date 2020-04-23 22:49
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class Mobile {

    public static void main(String[] args) {
        Volt5 volt5 = new VoltAdapter();
        Mobile mobile = new Mobile();
        mobile.charge(volt5);

        // 组合的实现方式
        Volt5 v5 = new VoltAdapter2(new Volt220());
        mobile.charge(v5);
    }

    public void charge(Volt5 volt5) {
        System.out.println("我开始充电了，我需要的电压是5V,我得到的电压是:" + volt5.getVolt5());
    }
}
