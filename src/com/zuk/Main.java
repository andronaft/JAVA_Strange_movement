package com.zuk;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.return_beta() + "\n\n\n");

        Second_Sub_1 second_sub_1_1 = new Second_Sub_1(1, "dud", 123);
        second_sub_1_1.set_avrg_mounth_salary();
        Second_Sub_1 second_sub_1_2 = new Second_Sub_1(2, "dud", 155);
        second_sub_1_2.set_avrg_mounth_salary();
        Second_Sub_1 second_sub_1_3 = new Second_Sub_1(3, "andr", 167);
        second_sub_1_3.set_avrg_mounth_salary();
        Second_Sub_2 second_sub_2_1 = new Second_Sub_2(4, "hhh", 1255);
        second_sub_2_1.set_avrg_mounth_salary();
        Second_Sub_2 second_sub_2_2 = new Second_Sub_2(4, "hhh", 2000);
        second_sub_2_2.set_avrg_mounth_salary();

        ArrayList<Second_Base> worker = new ArrayList<>();
        worker.add(second_sub_1_1);
        worker.add(second_sub_1_2);
        worker.add(second_sub_1_3);
        worker.add(second_sub_2_1);
        worker.add(second_sub_2_2);

        Collections.sort(worker, Comparator.comparing(Second_Base::getAvrg_mounth_salary)
                .thenComparing(Second_Base::getName));

        for (int j=0; j < worker.size(); j++) {
            System.out.println((worker.get(j).getAvrg_mounth_salary() + " " + worker.get(j).getName() + " " + worker.get(j).getId()));
        }

        for (int j=(worker.size()-3); j <worker.size(); j++) {
            System.out.println( worker.get(j).getId());
        }

        try(FileWriter writer = new FileWriter("Lab3_part2.txt", false))
        {
            for (int j=0; j < worker.size(); j++) {
                writer.write((worker.get(j).getAvrg_mounth_salary() + " " + worker.get(j).getName() + " " + worker.get(j).getId()+"\n"));
            }
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.out.println("Do you want to play a game?))) press 1");
        Scanner input = new Scanner(System.in);
        if(input.nextInt()==1){
            Third third = new Third();
            System.out.println(third.play_game());
        }

        Fourth fourth = new Fourth();
        fourth.read();

        Fifth fifrh = new Fifth();
        System.out.println(fifrh.reverseIt("asdfghjjjk"));
    }
}
