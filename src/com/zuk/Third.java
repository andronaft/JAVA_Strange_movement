package com.zuk;

import java.util.Random;
import java.util.Scanner;

public class Third {
    public String play_game(){
        int prog,user,counter,min,max;
        // Генерируем случайное целое число от 1 до 10
        Random rnd = new Random(System.currentTimeMillis());
        prog = rnd.nextInt(100);
        System.out.println("Programma zagadala chislo ");
        counter = 0; user = 0 ;min =0 ;max =100;
        do {
            counter++;
            System.out.print("\nVvedite svoje chislo: ");
            Scanner input = new Scanner(System.in);
            if(input.hasNextInt()) {
                user = input.nextInt();
                if(user == prog) {
                    System.out.println("Vi ugadali!!! Chislo popitok - "+counter);
                } else {
                    if (user >= 0 || user <= 100) {
                        System.out.println("Vi ne ugadali:");
                        if(prog < user) {
                            max = user;
                            System.out.println("=> Podskazka: Vozjmite chislo menjshe ot " + min +" do " + max);
                        } else {
                            min = user;
                            System.out.println("=> Podskazka: Vozjmite chislo bolshe ot "+ min +" do " + max);
                        }
                    } else {
                        System.out.println("Vi vveli nepravilnoje chislo vvodite ot " + min +" do " + max);
                    }
                }
            } else {
                System.out.println("Vi vveli ne to chislo ili bukvy");
            }
        } while(user != prog);
        return "Do svidanja!";
    }
}
