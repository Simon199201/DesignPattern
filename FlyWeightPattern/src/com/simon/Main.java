package com.simon;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";//常量池
        String str3 = new String("abc");
        String str4 = "ab" + "c";//常量池
        // 享元模式，同样的案例有Message和图片缓存，message回收和获取Message.obtain();
        //

        //使用equals只判断字符值
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str2));

        //等号判等 判断两个对象是否同一个地址
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str2);
        System.out.println(str4 == str2);

    }
}
