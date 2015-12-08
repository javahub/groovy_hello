package com.shuyun.groovy.hello.start

/**
 * Created by cailei on 15/12/7.
 */

class LazyBean {

    LazyBean(String msg){
        println msg
        println ""
    }

    def echo(value){
        println value;
    }
}
