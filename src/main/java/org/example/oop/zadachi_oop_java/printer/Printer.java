package org.example.oop.zadachi_oop_java.printer;


public class Printer implements IPrinter {

    private int paintVolume; // текущий объем краски в принтере

    // можно создавать пустой принтер без параметров
    public Printer() {
    }

    // при создании принтера можем указать объем доступной краски
    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }


    /**
     * Печатать текст в консоль
     * @param text переданный текст для печатания
     */
    @Override
    public void print(String text) {

        System.out.println("На печать отправлен текст: " + text + ", длина: " + text.length());

        // Если не хватает краски для печати - ничего не печатать и выводить сообщение об ошибке
        if (text.length() > paintVolume) { // длина текста для печати больше, чем остаток краски
            int diff = text.length() - paintVolume; // сколько не хватает краски
            System.out.println("Не хватило краски: " + diff + " (всего краски в принтере " + paintVolume + ")");
            return; // выходим и ничего не печатаем (дальше код выполняться не будет)
        }

        // если все условия выше выполнены - печатаем текст

        paintVolume = paintVolume - text.length(); // отнимаем краску за распечатанный текст

        // paintVolume -= text.length(); - аналог записи выше

        System.out.println("Текст распечатан: " + text + ", "+ "у принтера осталось краски: " + paintVolume);

    }

    // заправить новую краску
    @Override
    public int charge(int symbolsCount) {
        paintVolume += symbolsCount; // прибавляем к переменной новое значение (доливаем краски в принтер)
        System.out.println("Принтер пополнен на длину текста " + symbolsCount + " (всего краски в принтере: " + paintVolume + ")");

        return symbolsCount;
    }

    @Override
    public int getPaintVolume() {
        return paintVolume;
    }

}
