package com.giho;

import java.util.*;

public class Q03_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] numbersClone = numbers.clone();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbersClone.length; j++) {
                set.add(numbers[i] + numbersClone[j]);
            }
        }
        return set.stream().sorted().mapToInt(i -> i).toArray();
    }
}
