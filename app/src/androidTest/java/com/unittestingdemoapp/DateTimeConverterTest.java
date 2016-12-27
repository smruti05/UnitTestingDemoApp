package com.unittestingdemoapp;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.util.Calendar;

public class DateTimeConverterTest extends TestCase{
    Calendar calendar = Calendar.getInstance();
    @Test
    public void convert(){
        Assert.assertEquals("Positive test case - update date with current date", "27th Dec 2016", DateTimeConverter.convertDateTime(calendar.getTime()));
    }
    @Test
    public void check() {
        Assert.assertNotNull("Positive test case", DateTimeConverter.convertDateTime(calendar.getTime()));
    }
    @Test
    public void check_isNotToday() {
        Assert.assertNotEquals("Positive test case", "today", DateTimeConverter.convertDateTime(calendar.getTime()));
    }
    @Test
    public void check_isToday() {
        Assert.assertSame("Negative test case", "27/12/2016", DateTimeConverter.convertDateTime(calendar.getTime()));
    }
    @Test
    public void check_isNull() {
        Assert.assertNotNull("Negative test case - Pass the null value to convert()", DateTimeConverter.convertDateTime(null));
    }
}
