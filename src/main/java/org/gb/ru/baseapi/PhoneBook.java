package org.gb.ru.baseapi;

import java.util.ArrayList;
import java.util.HashMap;

/***
 * @apiNote Интерфейс телефонной книги
 */
public interface PhoneBook {
    void add(String name, ArrayList<Integer> numbers);

    void add(String name, Integer number);

    void add(String name, Integer... number);

    void delete(String name, ArrayList<Integer> numbers);

    void delete(String name, Integer number);

    void delete(String name, Integer... number);

    void deleteAll(String name);

    void sort(String name);

    void sortAll();

    HashMap<String, ArrayList<Integer>> getPhoneBook();
}
