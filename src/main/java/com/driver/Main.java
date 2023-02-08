package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw1 = new RWOnly();
//        rw1.name = "Shoaib";
//       this error shows when trying to access private member 'name' has private access in 'com.driver.RWOnly'
        rw1.setter("Shoaib");
        rw1.getter();
//        System.out.println(rw1.getter());
    }
}