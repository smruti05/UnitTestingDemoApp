package com.unittestingdemoapp;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class DateTimeConverterTest extends TestCase{
    Calendar calendar = Calendar.getInstance();
    @Test
    public void convert(){
        Assert.assertEquals("27th Dec 2016", DateTimeConverter.convertDateTime(calendar.getTime()));
    }
    @Test
    public void check() {
        Assert.assertNotNull(DateTimeConverter.convertDateTime(calendar.getTime()));
    }
}
