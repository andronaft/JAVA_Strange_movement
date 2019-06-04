package com.zuk;

public class Second_Sub_1 extends Second_Base {

    private int hour_salary;

    public Second_Sub_1(int id, String name, int hour_salary) {
        super(id, name);
        this.hour_salary = hour_salary;
     }

    @Override
    void set_avrg_mounth_salary() {
        super.avrg_mounth_salary = 20.8 * 8 * hour_salary;
    }
}
