package com.springRESTful.test;
import org.junit.*;

import com.springrestful.bean.Hello;

import static junit.framework.Assert.*;

public class TestHello {

    @Test
    public void testHello() {
        Hello hello = new Hello();
        assertEquals(hello.sayHello(),"hello,bulid maven!");
    }

}