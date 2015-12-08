package com.shuyun.groovy.hello.start

import org.junit.Test

/**
 * Created by cailei on 15/12/7.
 */
class GroovyAnnotationTest {

    @Lazy LazyBean lazyBean=new LazyBean("start msg");
     LazyBean notLazybean=new LazyBean("not lazy  msg");

    @Test
    void testLazyField(){
        println "method start "
        lazyBean.echo(getClass())
        notLazybean.echo("not lazy")
    }

}
