package com.shuyun.groovy.hello.spock

import spock.lang.Specification

/**
 * Created by cailei on 15/12/12.
 */
class SpockStart extends Specification{


    def "start"(){


        when:
        println  a+""+b+""+c
       // 2/0
        then:
        println  a+""+b+""+c
        def e=thrown(Exception);
        println e.message
        where:
        a << [1,2]
        b << [0,1]
        c <<[1,3]
    }

}
