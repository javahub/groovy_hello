package com.shuyun.groovy.hello.closure
import org.junit.Test
/**
 * User: cailei
 * Date: 15/1/6
 * Time: 下午4:57
 */
class ClosureTest {


    @Test
    void testAlgorithm(){
        BinaryOper binaryOper=new BinaryOper(a: 1,b:100);
        println binaryOper.algorithm {first,second->first+second};
        println binaryOper.algorithm {first,second->first*second};
        println binaryOper.algorithm {first,second->first-second};
        println binaryOper.algorithm {first,second->first/second};
    }


}
