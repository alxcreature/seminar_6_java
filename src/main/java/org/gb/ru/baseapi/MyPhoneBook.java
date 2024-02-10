package org.gb.ru.baseapi;

import java.util.*;

/***
 * @apiNote Класс интерфейса PhoneBook
 */
public class MyPhoneBook implements PhoneBook {

    // Стек данных класса телефонной книги
    private static final HashMap<String, ArrayList<Integer>> book = new HashMap<>();

    /***
     * @apiNote Метод add добавляет Имя контакта со списком телефонных номеров
     * @param name      Имя контакта
     * @param numbers   Номера телефонов контакта списком ArrayList<Integer>
     */
    @Override
    public void add(String name, ArrayList<Integer> numbers) {
        if (!book.containsKey(name)) {
            book.put(name, new ArrayList<>(numbers));
        }
        book.get(name).addAll(numbers);
    }

    /***
     * @apiNote Метод add добавляет Имя контакта и телефонный номер
     * @param name      Имя контакта
     * @param number   Номер телефона контакта
     */
    @Override
    public void add(String name, Integer number) {
        if (!book.containsKey(name)) {
            book.put(name, new ArrayList<>());
        }
        book.get(name).add(number);
    }

    /***
     * @apiNote Метод add добавляет Имя контакта и номера телефонов перечислением
     * @param name      Имя контакта
     * @param number   Номера телефонов контакта перечислением
     */
    @Override
    public void add(String name, Integer... number) {
        if (!book.containsKey(name)) {
            book.put(name, new ArrayList<>());
        }
        for (Integer num: number){
            book.get(name).add(num);
        }
    }

    /***
     * @apiNote Метод delete удаляет телефонные номера по Имени контакта списком
     * @param name      Имя контакта
     * @param numbers   Номера телефонов контакта списком ArrayList<Integer>
     */
    @Override
    public void delete(String name, ArrayList<Integer> numbers) {
        if (book.containsKey(name)) {
            book.get(name).removeAll(numbers);
        }
        if (book.get(name).isEmpty()) book.remove(name);
    }
    /***
     * @apiNote Метод delete удаляет телефонный номер по Имени контакта
     * @param name      Имя контакта
     * @param number    Номер телефона контакта
     */
    @Override
    public void delete(String name, Integer number) {
        if (book.containsKey(name)) {
            book.get(name).remove(number);
        }
        if (book.get(name).isEmpty()) book.remove(name);
    }

    /***
     * @apiNote Метод delete удаляет телефонные номера по Имени контакта перечислением
     * @param name      Имя контакта
     * @param number    Номера телефонов контакта перечислением
     */
    @Override
    public void delete(String name, Integer... number) {
        for (Integer num: number){
            book.get(name).remove(num);
        }
        if (book.get(name).isEmpty()) book.remove(name);
    }

    /***
     * @apiNote Метод deleteAll удаляет все телефонные номера и имя контакта по Имени контакта
     * @param name      Имя контакта
     */
    @Override
    public void deleteAll(String name) {
        if (book.containsKey(name)) {
            book.get(name).clear();
            book.remove(name);
        }
    }

    /***
     * @apiNote Метод sort сортирет телефонные номера по Имени контакта по убыанию
     * @param name      Имя контакта
     */
    @Override
    public void sort(String name) {
        if (!book.containsKey(name)) {
            Collections.sort(book.get(name));
            Collections.reverse(book.get(name));
        }
    }

    /***
     * @apiNote Метод sortAll сортирует телефонные номера по Имени контакта по всей телефонной книге по убыванию
     */
    @Override
    public void sortAll() {
        for (int i = 0; i < book.size(); i++) {
            for (Map.Entry<String, ArrayList<Integer>> element : book.entrySet()){
                ArrayList<Integer> temp = new ArrayList<>(element.getValue());
                Collections.sort(temp);
                Collections.reverse(temp);
                book.replace(element.getKey(), temp);
            }
        }

    }

    /***
     * @apiNote Метод getPhoneBook возвращает указатель содержимого всей телефонной книги
     * @return Телефонная книга класса
     */
    @Override
    public HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return book;
    }
}
