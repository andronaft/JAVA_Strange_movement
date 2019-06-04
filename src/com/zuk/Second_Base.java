package com.zuk;

public abstract class Second_Base {


    private int id;
    private String name;
    protected double avrg_mounth_salary;

    abstract void set_avrg_mounth_salary();


    public Second_Base(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAvrg_mounth_salary() {
        return avrg_mounth_salary;
    }

}
