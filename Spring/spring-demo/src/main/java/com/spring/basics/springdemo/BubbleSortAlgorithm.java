package com.spring.basics.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
