package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw1 = new RWOnly();
//        rw1.name = "Shoaib";
//       this error shows when trying to access private member 'name' has private access in 'com.driver.RWOnly'
        rw1.setName("Shoaib");
        rw1.getName();
//        System.out.println(rw1.getName());
    }
}