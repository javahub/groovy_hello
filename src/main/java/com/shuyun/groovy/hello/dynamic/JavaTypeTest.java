package com.shuyun.groovy.hello.dynamic;

import org.junit.Test;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by cailei on 15/12/10.
 */
public class JavaTypeTest {

    @Test
    public void remove(){
        LinkedList<String> list=new LinkedList();
        list.add("00");
        list.add("11");
        list.add("22");
        list.remove(0);
        Collection collection=list;
        collection.remove(0);
        System.out.println(list.size());
        System.out.println(collection.size());
    }
    @Test
    public  void desing(){
        ThingInterface thing=new SomeThing();
        thing.care("one");
        thing=new NoThing();
        thing.care("two");
        thing=msg -> System.out.println("lambda--->>"+msg);
        thing.care("three");
    }
}
