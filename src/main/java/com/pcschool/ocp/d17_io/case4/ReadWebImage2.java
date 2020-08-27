package com.pcschool.ocp.d17_io.case4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ReadWebImage2 {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\car2.jpg");
        String path = "https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278_960_720.jpg";
        URL url = new URL(path);
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("USER-AGENT", "隨便寫"); // USER-AGENT 判定防止機器人抓取 
        try(InputStream is = conn.getInputStream(); // 取得網路串流
            FileOutputStream fos = new FileOutputStream(file);) {
            byte[] b = new byte[1];
            while(is.read(b) != -1) { // 將資料逐個 byte 讀進 byte[] b
                fos.write(b); // 將 byte[] b 的資料 逐個 byte 寫入到指定檔案 file
            }
            System.out.println("寫入完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
