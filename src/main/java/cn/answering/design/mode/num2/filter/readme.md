### 过滤器模式
允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。

在Java8中，stream()的filter就很好的使用了这种模式，让过滤变得简单

num1包中的是传统的过滤模式，而在num2包中，是结合函数化接口来做的过滤