package com.pcschool.ocp.d05.foo;

import com.pcschool.ocp.d05.Father;

public class Son2 extends Father{ // 認祖歸宗 extends 才能使用 Father money
    public void print() {  
        System.out.println(money);
    }
}
