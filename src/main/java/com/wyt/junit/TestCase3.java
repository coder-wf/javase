package com.wyt.junit;
 
import org.junit.Test;
 
import junit.framework.Assert;
 
public class TestCase3 {
 
    @Test
    public void testSum1() {
        int result = SumUtil.sum1(1, 2);
        Assert.assertEquals(result, 3);
    }
 
    @Test
    public void testSum2() {
        int result = SumUtil.sum2(1, 2,3);
        Assert.assertEquals(result, 5);
    }
}