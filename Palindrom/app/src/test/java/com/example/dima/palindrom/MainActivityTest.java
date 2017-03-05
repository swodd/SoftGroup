package com.example.dima.palindrom;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dima on 05.03.2017.
 */
public class MainActivityTest {

    @Test
    public void testOnCreate() throws Exception {
        MainActivity mainActivity = new MainActivity();
        String s = mainActivity.check("123321","123321");

        assertEquals("123321", s);
    }
}