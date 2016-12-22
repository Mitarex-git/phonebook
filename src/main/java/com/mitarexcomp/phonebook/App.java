package com.mitarexcomp.phonebook;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "������� ��� ��������:" );
        String input = System.console().readLine();
        HashMap<String,ArrayList<String>> phoneBook =
                new HashMap<String, ArrayList<String>>();
        ArrayList<String> tempList = new ArrayList<String>();
        tempList.add("+8 800 2000 500");
        tempList.add("+8 800 200 600");
        phoneBook.put("������ �.�.", tempList);
        tempList = new ArrayList<String>();
        tempList.add("+8 800 2000 700");
        phoneBook.put("������ �.�.", tempList);
        tempList = new ArrayList<String>();
        tempList.add("+8 800 2000 800");
        tempList.add("+8 800 2000 900");
        tempList.add("+8 800 2000 000");
        phoneBook.put("������� �.�.", tempList);
        if (phoneBook.containsKey(input))
        {
            System.out.println("������ �������, ������������� " + input + ":");
            for (String phoneNumber : phoneBook.get(input))
            {
                System.out.println(phoneNumber);
            }
        }
        else
            System.out.println("������� �� ������.");
    }
}
