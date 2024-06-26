package org.example.collection.SortExamples;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        Integer year1 = Integer.valueOf(car1.getYear());
        Integer year2 = Integer.valueOf(car2.getYear());
        return year1.compareTo(year2);
    }
    }