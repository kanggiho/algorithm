package com.giho;

import java.util.Arrays;
import java.util.Comparator;

public class Q02_배열제어하기 {
    public int[] solution(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
