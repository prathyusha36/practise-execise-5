package main.java.com.stackroute.pe5;
/*

   a program to implement set interface which sorts the given randomly ordered names
    in ascending order. Convert the sorted set in to an  array list

 */

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
/*
program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
 */
public class SetInterface {


    public ArrayList<String> convertSortedSetToArrayList(Set<String> demoSet)
    {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(demoSet);
        ArrayList<String> demoList = new ArrayList<>(treeSet);

        return demoList;

    }


    }

