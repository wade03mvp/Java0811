package com.pcschool.ocp.d18_nio.case3;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class StreamCopy {
    public static void main(String[] args) throws Exception{
        String surl = "https://us.123rf.com/450wm/famveldman/famveldman1601/famveldman160100041/50840469-baby-boy-wearing-diaper-in-white-sunny-bedroom-newborn-child-relaxing-in-bed-nursery-for-children-te.jpg?ver=6";
        URI uri = URI.create(surl);
        Path dest = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio\\baby.jpg");
        Files.copy(uri.toURL().openStream(), dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copy 成功!");
    }
}
