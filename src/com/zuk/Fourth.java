package com.zuk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fourth {
    public void read() {
        String[] text = null;
        try {
            String str = null;
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\andro\\IdeaProjects\\Lab_3_TDS\\Lab3_part4.txt"));
            while ((str = br.readLine()) != null) {
                text = str.split(" ");
                for (String it : text) {
                    System.out.printf("%s\t", it);
                }
                System.out.println();
            }
            br.close();
        } catch (IOException exc) {
            System.out.println("IO error!" + exc);
        }

        ArrayList<String> text_arr = new ArrayList<>(Arrays.asList(text));
        Collections.sort(text_arr, String.CASE_INSENSITIVE_ORDER);
        for (String i:text_arr) {
            System.out.println("hello");
            System.out.printf("%s\t", i);
        }
    }

}


