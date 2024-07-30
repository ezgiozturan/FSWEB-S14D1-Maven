package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(long id, String name, double salary,
                     MidDeveloper[] midDevelopers,
                     JuniorDeveloper[] juniorDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.midDevelopers = midDevelopers;
        this.juniorDevelopers = juniorDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public HRManager(int id, String name, int salary) {
        super(id,name,salary);
    }

    public void addEmployee (int index, JuniorDeveloper juniorDeveloper) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else  {
                System.out.println("Full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found" + index);

        }
    }

    public void addEmployee (int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else  {
                System.out.println("Full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found" + index);

        }
    }

    public void addEmployee (int index, MidDeveloper midDeveloper) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            } else  {
                System.out.println("Full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found" + index);

        }
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }

    @Override
    public void work() {
        System.out.println(getName() + " hr manager starts to working.");
    }
}
