# DesignPattern

## factory
工厂模式是:定义一个创建对象的类, 来封装实例化对象的行为

1. 不使用工厂模式
当不使用工厂模式时, 如果需要添加新的animal, AnimalStore需要更改
AnimalStore - Animal 直接联系

缺点:
1. 违反ocp原则(对拓展开放, 对修改关闭.既当我们给类添加功能时, 调用者尽量少修改源码)



当使用工厂模式时, 把创建对象的过程交给了AnimalFactory, 在添加新animal时, 只需要修改AnimalFactory, 而AnimalStore则是无感知的.
AnimalStore - AnimalFactory - Animal 中间加一层factory, 降低的耦合性

