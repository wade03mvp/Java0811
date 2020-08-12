package com.pcschool.ocp.game;

import java.util.Random;

public class English {  
    private int ans = new Random().nextInt(26)+65; // A = 65 所以要抓65~90的亂數
    private int count;
    public int check(int userAns) {
        count++;
        return userAns - ans;
    }
    public int getCount(){
        return count;
    }
}
