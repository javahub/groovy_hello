package com.shuyun.groovy.hello.start

/**
 * Created by cailei on 15/12/8.
 */
class DelegateDesign {

    int value;

    @Delegate  Compute compute=new Compute();

}
