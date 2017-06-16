package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lucke on 6/15/2017.
 */
public class CompoundComparator implements Comparator<City> {

    private List<Comparator<City>> comparators = new ArrayList<>();

    @Override
    public int compare(City o1, City o2) {
        int count = 0;
        while (count < comparators.size()) {
            Comparator<City> c = comparators.get(count);
            if (c.compare(o1, o2) == 0) {
                count ++;
            } else {
                return c.compare(o1, o2);
            }
        }

        return 0;
    }

    public void add(Comparator<City> c) {
        comparators.add(c);
    }
}
