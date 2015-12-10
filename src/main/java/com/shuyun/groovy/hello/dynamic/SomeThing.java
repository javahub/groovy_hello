package com.shuyun.groovy.hello.dynamic;

/**
 * Created by cailei on 15/12/10.
 */
public class SomeThing implements ThingInterface{
    @Override
    public void care(Object msg){
        System.out.println("something-->>>"+msg);
    }
}
