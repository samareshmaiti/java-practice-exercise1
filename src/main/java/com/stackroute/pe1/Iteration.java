package com.stackroute.pe1;
import java.util.Scanner;

public class Iteration {

    public int[] printer(int number){
        int initialSize = 0;
        int initialIndex = 0;
        for (int i = 1; i <= number; i++)
            initialSize += i;
        int[] resultArray = new int[initialSize];
        for (int i = 1; i <= number; i++){
            for (int j = 0; j < i; j++) {
                resultArray[initialIndex] = i;
                initialIndex++;
            }
        }
        return resultArray;
    }
}
