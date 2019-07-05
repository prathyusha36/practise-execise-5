package main.test.com.stackroute.pe5;

import main.java.com.stackroute.pe5.UpdateArrayList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayListTest {
    UpdateArrayList object;
    List<String> list =new ArrayList<String>();
    {
        list.add("apple");
        list.add("orange");
        list.add("grapes");
        list.add("mango");
    }
    List<String> updatedlist =new ArrayList<String>();
    {
        updatedlist.add("kiwi");
        updatedlist.add("orange");
        updatedlist.add("grapes");
        updatedlist.add("mango");
    }
    List<String> updatedlist1 =new ArrayList<String>();
    {
        updatedlist1.add(" ");
        updatedlist1.add("orange");
        updatedlist1.add("grapes");
        updatedlist1.add("mango");
    }


    @org.junit.Before
    public void setUp() throws Exception {
        object=new UpdateArrayList();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void GivenArrayUpdateSpecificElement() {
        List<String> result=object.updateElement(list,"apple","kiwi");
        assertEquals(updatedlist,result);
    }
    @Test
    public void GivenArrayUpdateSpecificElementWithNullString() {
        List<String> result=object.updateElement(list,"apple"," ");
        assertEquals(updatedlist1,result);
    }
}