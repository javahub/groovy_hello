package com.shuyun.groovy.hello.start

import org.junit.Test

/**
 * Created by cailei on 15/12/7.
 */
class GroovyStartTest {


    @Test
    void testNullOper() {
        println nullOper("not null");
        println nullOper(null);
    }

    static def nullOper(String msg) {
        msg?.length()
    }

    @Test
    void testException() {
        //java里面Exception与子类需要捕获,但groovy不是,都是runtime
        Thread.sleep(1000);
    }

    @Test
    void testRetun() {
        println returnValue("return")
    }

    static def returnValue(String value) {
        // 避免return与;
        value
    }

    @Test
    void testCommonOper() {
        commonOper();
    }

    static void commonOper() {
        1.upto(3) {
            println it;
        }
        println "---wo shi fen ge xian---"
        3.times {
            println it;
        }
        println "---wo shi fen ge xian---"
        0.step(10, 3) {
            println it;
        }

    }

    @Test
    void TestoperChar() {
        operChar();
    }

    static void operChar() {
        for (ch in 'a'..'d') {
            println ch;
        }
        def map = [1: "a"];
        map << [2: "b"];
        map.each {
            println "$it.key:$it.value"
        }
        Compute compute = new Compute(a: 1);
        println compute + 1;
    }

    @Test(expected = ReadOnlyPropertyException)
    void testJavaBean() {
        User user = new User(password: "java2Groovy");
        println "--" + user.password;
        user.password = "java2java";
        println user
        user.name = "groovy"
        println user;

    }

    @Test
    void testDelegate(){
        DelegateDesign delegateDesign=new DelegateDesign(a: 11);
        println delegateDesign+22
    }


}
