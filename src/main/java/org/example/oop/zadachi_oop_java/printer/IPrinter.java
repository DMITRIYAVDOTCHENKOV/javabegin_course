package org.example.oop.zadachi_oop_java.printer;

public interface IPrinter {

    //Методы действия

    /**
     * Метод печатания текста
     * @param text переданный текст для печатания
     */
    void print(String text);

    /**
     * Метод заправки принтера краской
     * @param volume значения на сколько будет заправлен принтер
     * @return
     */
    int charge(int volume);

    //метод-свойства

    /**
     * Общее кол-во краски в принетере
     * @return
     */
    int getPaintVolume();

}
