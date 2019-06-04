package com.zuk;

public class Second_Sub_2 extends Second_Base {

    private int fixed_mounth_salary;

    public Second_Sub_2(int id, String name, int fixed_mounth_salary) {
        super(id, name);
        this.fixed_mounth_salary = fixed_mounth_salary;
    }

    @Override
    void set_avrg_mounth_salary() {
        super.avrg_mounth_salary = fixed_mounth_salary;
    }
}
