package com.codecool.sorter;

import java.util.ArrayList;
import java.util.List;

public class CountingSorter implements Sorter {

    @Override
    public List<Integer> sort(List<Integer> numbersToSort, Order order) {

        int[] nums = new int[100];

        for (int num : numbersToSort) {
            if (num < 0 || num > 99) {
                throw new IllegalArgumentException(
                        "This sorting algorithms works only for numbers between 0 to 99");
            }
            nums[num] = nums[num] + 1;
        }

        List<Integer> resultList = new ArrayList<>(numbersToSort.size());

        if (order == Order.Ascending) {
            for (int j = 0; j <= nums.length - 1; j++) {
                for (int i = 0; i < nums[j]; i++) {
                    resultList.add(j);
                }
            }
        } else {
            for (int j = nums.length - 1; j >= 0; j--) {
                for (int i = 0; i < nums[j]; i++) {
                    resultList.add(j);
                }
            }
        }
        return resultList;
    }
}
