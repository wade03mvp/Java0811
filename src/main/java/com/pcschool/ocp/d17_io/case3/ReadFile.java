package com.pcschool.ocp.d17_io.case3;

import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\report.txt");
        try(FileReader fis = new FileReader(file);) { // 預設抓取 ANSI 編碼的內容 (會出現亂碼)
            StringBuilder sb = new StringBuilder();
            char[] cbuf = new char[1];
            while(fis.read(cbuf) != -1) {
                String s = new String(cbuf); // char[] 轉 String
                sb.append(s);  // 將 s 累積到 sb 
            }
            System.out.println(sb);
        } catch (Exception e) {
        }
    }
}
