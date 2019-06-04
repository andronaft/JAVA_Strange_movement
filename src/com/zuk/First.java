package com.zuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class First {

    public ArrayList return_beta(){
        Random rnd = new Random(System.currentTimeMillis());

        ArrayList<Integer> alphaa = new ArrayList<>();
        ArrayList<Integer> betaa = new ArrayList<>();

        for(int i = 0; i < 150; i++ ) {
            alphaa.add(rnd.nextInt(150));
        }
        for (int i:alphaa) {
            if(betaa.size()<15){
                betaa.add(i);
                Collections.sort(betaa);
            }
            else  if(i > betaa.get(0)){
                betaa.set(0,i);
                Collections.sort(betaa);
            }
        }

        return betaa;
    }
}
