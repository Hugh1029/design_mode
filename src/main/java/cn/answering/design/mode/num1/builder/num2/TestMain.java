package cn.answering.design.mode.num1.builder.num2;

/**
 * @author zhangjp
 * @date 2020-04-22 23:43
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    // 使用
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder builder = new MacComputerBuilder("因特尔I9", "三星内存条", "三星固态硬盘");
        director.makeComputer(builder);
        Computer macComputer = builder.getComputer();
        // 太麻烦了....
    }
}
