package com.pcschool.ocp.d10.case3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("國文");
        set.add(new Integer(100));
        set.add("英文");
        set.add(80);   // 相當於 new Integer(80) 或 Integer.valueOf(80)
        set.add("數學");
        set.add(90);
        System.out.println(set);
        
        // 尋訪器 (不可逆)
        Iterator iter = set.iterator();
        while(iter.hasNext()) {         // 確認是否有元素? (自動往下尋找)
            Object next = iter.next();  // 取得元素內容
            System.out.println(next);   // 印出元素內容
        }
        set.iterator(); // 第二次尋找要重新設定
    }  
}
