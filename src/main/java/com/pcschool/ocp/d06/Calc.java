package com.pcschool.ocp.d06;

import java.util.Arrays;

public class Calc {
    public int add(int... values){ // ... => 省略號
        return Arrays.stream(values).sum();
    } 
}
