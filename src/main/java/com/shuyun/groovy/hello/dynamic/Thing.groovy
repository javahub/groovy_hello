package com.shuyun.groovy.hello.dynamic

/**
 * Created by cailei on 15/12/10.
 */
class Thing {

    def msg;

    def exe(who){
        who.care(msg);
    }
}
