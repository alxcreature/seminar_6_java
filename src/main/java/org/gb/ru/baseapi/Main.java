package org.gb.ru.baseapi;
/*
Java: знакомство и как пользоваться базовым API (семинары)
Урок 6. Хранение и обработка данных ч3: множество коллекций Set
Формат сдачи: ссылка на подписанный git-проект.

Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class Main {
    public static void main(String[] args) {

        PhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.add("Алёша", 8961);
        System.out.println(".add(Алёша, 8961) = " + myPhoneBook.getPhoneBook());
        myPhoneBook.add("Алёша", 8918, 8965);
        System.out.println(".add(Алёша, 8918, 8965) = " + myPhoneBook.getPhoneBook());
        myPhoneBook.add("Петя", 8988);
        System.out.println(".add(Петя, 8988) = " + myPhoneBook.getPhoneBook());
        myPhoneBook.add("Серёжа", 8999);
        System.out.println(".add(Серёжа, 8999) = " + myPhoneBook.getPhoneBook());
        myPhoneBook.add("Катя", 8928, 8911, 8917);
        System.out.println(".add(Катя, 8928, 8911, 8917) = " + myPhoneBook.getPhoneBook());
        myPhoneBook.sort("Алёша");
        System.out.println(".sort(Алёша) = " + myPhoneBook.getPhoneBook());
        myPhoneBook.sortAll();
        System.out.println(".sortAll() = " + myPhoneBook.getPhoneBook());
        myPhoneBook.delete("Алёша", 8918);
        System.out.println(".delete(Алёша, 8918) = " + myPhoneBook.getPhoneBook());
        myPhoneBook.delete("Катя", 8928, 8917);
        System.out.println(".delete(Катя, 8928, 8917) = " + myPhoneBook.getPhoneBook());
        myPhoneBook.deleteAll("Катя");
        System.out.println(".deleteAll(Катя) = " + myPhoneBook.getPhoneBook());
    }
}