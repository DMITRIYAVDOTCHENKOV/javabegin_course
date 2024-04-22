package org.example.collection.listCollection;
//https://dzone.com//articles/arraylist-vs-linkedlist-vs
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
//        arrayListExamples();
        linkedListExamples();
    }


    public static void arrayListExamples(){
        ArrayList<Car> cars = new ArrayList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("NIVA");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);// можно добавлять дубли

        cars.add(new Car("Toyota"));// создание объекта в месте добавления

        System.out.println("cars.size() = " + cars.size());// размер коллекции

        System.out.println("cars.contains(car2) = " + cars.contains(car2)); // содержит ли коллекция определенный объект

        int index = cars.indexOf(car3);
        System.out.println("index = " + index);// получение индекса элемента (индексация с нуля)

        Car selectedCar = cars.get(3);// получение объекта по индексу
        System.out.println("selectedCar = " + selectedCar.getName());


        // ordered
        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }


        cars.clear();// очистка коллекции
        System.out.println("cars.isEmpty() = " + cars.isEmpty());// пустая ли коллекция

//        selectedCar = cars.get(3);// ошибка IndexOutOfBoundsException, т.к. по этому индексу нет объекта


    }


    public static void linkedListExamples(){

        LinkedList<Car> cars = new LinkedList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("NIVA");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Toyota");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.addFirst(car4);


//        Iterator<Car> iterator = cars.descendingIterator(); // итератор в обратную сторону
        Iterator<Car> iterator = cars.iterator(); // итератор в обратную сторону

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

    }



}
