package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by lucke on 6/15/2017.
 */
public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();

        if (area1 > area2) {
            return -1;
        } else if (area1 < area2) {
            return 1;
        } else {
            return 0;
        }
    }
}
