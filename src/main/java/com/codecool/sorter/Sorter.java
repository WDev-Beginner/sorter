package com.codecool.sorter;

import java.util.List;

public interface Sorter {
    default List<Integer> sort(List<Integer> numbersToSort) {
        return sort(numbersToSort, Order.Ascending);
    }

    List<Integer> sort(List<Integer> numbersToSort, Order order);
}
