package tests;

import org.junit.Assert;
import source.NumberParser;
import org.junit.Test;

public class ParseTest {

    @Test
    public void parseIntTest() {
        Assert.assertEquals(NumberParser.parseInt("one"), 1);
        Assert.assertEquals(NumberParser.parseInt("twenty-three"), 23);
        Assert.assertEquals(NumberParser.parseInt("two hundred forty-six"), 246);
        Assert.assertEquals(NumberParser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"), 783919);
        Assert.assertEquals(NumberParser.parseInt("twenty thousand"), 20000);
        Assert.assertEquals(NumberParser.parseInt("seven hundred eighty-three thousand"), 783000);
        Assert.assertEquals(NumberParser.parseInt("nine hundred and nineteen"), 919);
        Assert.assertEquals(NumberParser.parseInt("seven hundred eighty-three thousand forty"), 783040);
        Assert.assertEquals(NumberParser.parseInt("seven hundred thousand"), 700000);
        Assert.assertEquals(NumberParser.parseInt("two hundred thousand and two"), 200002);
    }
}
