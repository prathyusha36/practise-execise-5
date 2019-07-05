package main.test.com.stackroute.pe5;

import main.java.com.stackroute.pe5.Frequency;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FrequencyTest {

    Frequency fq;
    Map<String,Boolean> mp= new HashMap<String, Boolean>();
    {
        mp.put("a",true);
        mp.put("b",false);
        mp.put("c",true);
        mp.put("d",false);
    }
    String[] arr={"a","b","c","d","a","c","c"};

    String[] arr1={"a","b","c","d","a"};


    @Before
    public void setUp() throws Exception {
        fq=new Frequency();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void frequencyOfStringSuccess() {
        assertEquals(mp,fq.frequencyOfString(arr));
    }

    @Test
    public void frequencyOfStringFailure() {
        assertNotEquals(mp,fq.frequencyOfString(arr1));
    }
}