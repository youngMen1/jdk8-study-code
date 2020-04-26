package com.seal.study.test.annotatedtype;


import com.seal.study.test.annotatedtype.annotation.*;

// 直接作用在T上的类型注解@注解_TYPE_USE_2_1目前没法获取
public class Child<@注解_TYPE_USE_2_1 T extends @注解_TYPE_USE_2_2 Parent> {
    public @注解_TYPE_USE_1 Parent.Inner field1;
    public T field2;
    public @注解_TYPE_USE_3 Parent<? extends Number, ? super Integer> field3;
    public Parent<? extends @注解_TYPE_USE_4_1 Number, ? super @注解_TYPE_USE_4_2 Integer> field4;
    public Parent[] @注解_TYPE_USE_5 [] field5;  // 放在其他地方的类型注解目前无法被获取
    
    public Child() {
    }
}
