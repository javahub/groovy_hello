package com.shuyun.groovy.hello.dynamic;

/**
 * Created by cailei on 15/12/10.
 */
public class NoThing implements ThingInterface{

    @Override
    public void care(Object msg){
        System.out.println("noThing-->>"+msg);
    }
}
