package com.example.dima.complementary;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Dima on 06.03.2017.
 */
public class MainActivityTest {

    @Test
    public void testPrintPairSums() throws Exception {
        MainActivity mainActivity = new MainActivity();
        int[] array = new int[10];
        for(int i = 1; i < array.length; i++){
            array[i] = i;
        }
        Map<Integer,Integer> map2 = new HashMap<>(mainActivity.printPairSums(array,5));

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,5);
        map.put(1,4);
        map.put(2,3);

        assertEquals(map, map2);

    }
}