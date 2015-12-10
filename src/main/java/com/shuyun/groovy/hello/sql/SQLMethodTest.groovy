package com.shuyun.groovy.hello.sql

import org.junit.Test

/**
 * Created by cailei on 15/12/8.
 */
class SQLMethodTest {

    static def exeEngine = groovy.sql.Sql.newInstance("jdbc:h2:mem:DBName;DB_CLOSE_DELAY=-1",
            "sa", "", "org.h2.Driver"
    );

    @Test
    void testQuery() {
        String createTable = """CREATE TABLE CHANGELOG (ID varchar(30) NOT NULL)""";
        exeEngine.execute(createTable);
        for (i in 1..20) {
            exeEngine.executeInsert("insert into CHANGELOG values($i)")
        }

        def rows=exeEngine.rows("select * from CHANGELOG");
        rows.asImmutable().each {
           println  it.getProperty("ID")
        }
    }
}

