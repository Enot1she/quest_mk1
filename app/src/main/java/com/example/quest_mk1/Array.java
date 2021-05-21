package com.example.quest_mk1;
public class Array {

    boolean[] result = new boolean[2];

    public void getAns(boolean res, int num) {
        result[num] = res;
    }

    public boolean[] getArr() {
        return result;
    }
}