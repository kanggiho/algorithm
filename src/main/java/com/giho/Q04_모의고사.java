package com.giho;

import java.util.*;

public class Q04_모의고사 {

    public int[] solution(int[] answers) {
        int[] correct = new int[3];
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        ArrayList<Integer> resList = new ArrayList<>();
        int maxNum = -1;

        for(int i=0; i<answers.length; i++){
            int a_index = i%5;
            int b_index = i%8;
            int c_index = i%10;
            if(a[a_index] == answers[i]){
                correct[0]++;
            }
            if(b[b_index] == answers[i]){
                correct[1]++;
            }
            if(c[c_index] == answers[i]){
                correct[2]++;
            }
        }

        maxNum = Math.max(Math.max(correct[0],correct[1]),correct[2]);
        for(int i=0;i<correct.length;i++){
            if(correct[i]==maxNum){
                resList.add(i+1);
            }
        }

        return resList.stream().mapToInt(Integer::intValue).toArray();
    }

}
