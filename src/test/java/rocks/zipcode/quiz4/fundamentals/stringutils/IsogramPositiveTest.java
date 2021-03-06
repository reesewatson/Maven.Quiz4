package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

public class IsogramPositiveTest {
    @Test
    public void test1() {
        String input = "Jump";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test2() {
        String input = "Jj";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test3() {
        String input = "Jj0Oo";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }


    @Test
    public void test4() {
        String input = "The Quick";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }

    @Test
    public void test5() {
        String input = "Brown";
        Assert.assertFalse(StringUtils.isIsogram(input));
    }
}
