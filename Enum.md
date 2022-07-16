# 枚举

## 枚举类的概述
枚举是JAVA中一种特殊的类，它可以定义固定数量的枚举实例，例如：性别，季节等等

## 为什么要使用枚举类
比如人的属性中的性别，只能限定 男 女，如果不使用枚举类，可以传入任意字符，造成数据非法

## 格式
定义枚举类
```
enum 枚举类{
    第一行都是罗列枚举实例，这些枚举实例直接写大写名字即可
}
```

## 入门案例
EnumTest.java