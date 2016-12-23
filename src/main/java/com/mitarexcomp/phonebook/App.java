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
        System.out.println( "Введите имя контакта:" );
        String input = System.console().readLine();
        HashMap<String,ArrayList<String>> phoneBook =
                new HashMap<String, ArrayList<String>>();
        ArrayList<String> tempList = new ArrayList<String>();
        tempList.add("+8 800 2000 500");
        tempList.add("+8 800 200 600");
        phoneBook.put("Иванов И.И.", tempList);
        tempList = new ArrayList<String>();
        tempList.add("+8 800 2000 700");
        phoneBook.put("Петров П.П.", tempList);
        tempList = new ArrayList<String>();
        tempList.add("+8 800 2000 800");
        tempList.add("+8 800 2000 900");
        tempList.add("+8 800 2000 000");
        phoneBook.put("Сидоров С.С.", tempList);
        if (phoneBook.containsKey(input))
        {
            System.out.println("Список номеров, принадлежащих " + input + ":");
            for (String phoneNumber : phoneBook.get(input))
            {
                System.out.println(phoneNumber);
            }
        }
        else
            System.out.println("Контакт не найден.");
    }
}
