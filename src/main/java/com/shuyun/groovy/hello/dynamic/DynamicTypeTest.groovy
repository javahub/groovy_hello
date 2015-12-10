package com.shuyun.groovy.hello.dynamic

import org.junit.Test

/**
 * Created by cailei on 15/12/7.
 */
class DynamicTypeTest {


    @Test
     void remove(){
        LinkedList<String> list=new LinkedList();
        list.add("00");
        list.add("11");
        list.add("22");
        list.remove(0);
        Collection collection=list;
        collection.remove(0);
        println list.size();
        println collection.size();
    }

    @Test
    void desing(){
        Thing thing=new Thing()
        thing.msg="one"
        thing.exe(new NoThing())
        thing.msg="two"
        thing.exe(new SomeThing())
        def care=1;
        care.metaClass.care={r->println "mop"+r};
        thing.msg="three";
        thing.exe(care);

    }

}
