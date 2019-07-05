package main.java.com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
Java program to update specific array element by given element
   */
public class UpdateArrayList {
    public List<String> updateElement(List<String> list,String value ,String updatevalue)
    {
        ListIterator<String> itr=list.listIterator();

        while(itr.hasNext())
        {
            String next=itr.next();
            if(next.equals(value))
            {
                itr.set(updatevalue);
            }

        }
        return list;

    }

}
