package com.simon;

import com.simon.dynamicPattern.DynamicProxy;
import com.simon.staticproxy.ILawsuit;
import com.simon.staticproxy.Lawsuit;
import com.simon.staticproxy.XiaoMing;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        //静态代理
        ILawsuit xiaoming = new XiaoMing();
        Lawsuit lawsuit = new Lawsuit(xiaoming);
//
//        lawsuit.submit();
//        lawsuit.burden();
//        lawsuit.defend();
//        lawsuit.finish();


        //动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(xiaoming);
        ILawsuit lawsuit_proxy = (ILawsuit) Proxy.newProxyInstance(xiaoming.getClass().getClassLoader(), new Class<?>[]{ILawsuit.class}, dynamicProxy);
        lawsuit_proxy.submit();
        lawsuit_proxy.burden();
        lawsuit_proxy.defend();
        lawsuit_proxy.finish();


    }
}
