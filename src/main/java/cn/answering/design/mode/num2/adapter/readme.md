### 适配器模式
首先说明：一定意义上来说，适配器模式不是用来在研发阶段使用的；而是已经投入生产的环境下，两个接口不兼容而出现的模式；

生活中，比如我们的手机可能是5V充电的，但我们国家的电是220V的，而我们的充电头可以说是一个电源适配器。他让两个并不可以一起工作的接口，\
可以再一起工作。

代码中的设计模式也是这种理念，当两个无法在一起工作的接口需要在一起使用的时候，所以就有了适配器模式。\
比如Java中的jdbc，就是适配器模式的概念。\
适配器的组成:\
Target: 目标接口，就是期望得到的接口;\
Adaptee: 需要适配的接口;\
Adapter: 适配器，负责把Adaptee转换成Target的类。

实现方式:\
1. 继承Adaptee类，实现Target接口\
2. 实现Target接口，Adaptee类作为参数，组合的方式实现