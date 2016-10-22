package com.fmi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] text = "Ana are mere".toCharArray();
        int start = 0, finish;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ' || i==text.length-1) {
                finish=i-1;
                while(start<finish)
                {
                    char aux = text[start];
                    text[start]=text[finish];
                    text[finish]=aux;
                    start++;
                    finish--;
                }
                start=i+1;
            }
        }

        System.out.println(String.valueOf(text));
    }
}
