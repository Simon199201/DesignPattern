package com.simon;

public class MobilePhone {
    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new SamsungCamera();
    public void dail(){
        mPhone.dail();
    }
    //对外提供统一的接口，接口实现结合子系统
    public void videoChat(){
        System.out.println("视频通话接通中...");
        mCamera.open();
        mPhone.dail();
    }
}
