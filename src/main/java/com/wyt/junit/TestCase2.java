package com.wyt.junit;
 
import org.junit.Test;
 
import junit.framework.Assert;
 
public class TestCase2 {
 
    @Test
    public void testSum1() {
        int result = SumUtil.sum1(1, 2);
        Assert.assertEquals(result, 3);
    }
 
}