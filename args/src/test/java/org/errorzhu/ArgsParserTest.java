package org.errorzhu;


import org.junit.Assert;
import org.junit.Test;

public class ArgsParserTest {
    @Test
    public void test_get_value(){
        ArgsParser argsParser = new ArgsParser("-p 8080 -d /tmp");
        Assert.assertEquals(8080,argsParser.getValue("p"));

    }
}
