package com.stackroute.pe1;
import java.util.Scanner;
public class SumOfElements {


        public String  sumOfIntegerValue(String input)
        {
            String[] array = input.split(" ");
            boolean find = true;
            int sum = 0;
            for (String str: array) {
                for (int i = 0; i < str.length(); i++){
                    if ( (!(Character.isDigit(str.charAt(i)))) &&
                            (str.charAt(i) != '-') &&
                            (str.charAt(i) != '+')){
                        find = false;
                    }

                }
            }
            if (find){
                for (String str: array){
                    sum += Integer.parseInt(str);
                }
                return String.valueOf(sum);
            }
            else {
                return "Non Integer Value";
            }
        }

    }

