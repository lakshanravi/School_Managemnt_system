package org.example;

public class Teacher {
    private int id;
    private String name;


    //normal salary ek
    private int salary;
    //earned krpu gaana
    private int salaryEarned;


    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

        //initially 0ine meka
        this.salaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    //constructor eken value denw thama. bt aaye e object ektm constructor ek call krnn bhne.e hinda thema passe value change krnn oni nm setter denne. ewit setter ek call krl value change krnn pulwn
    //salary can be change later, therfor we need to add setter

    public void setSalary(int salary) {
        this.salary = salary;
    }


    //adds to slary earned
    //e gaana school eke slli wlin adu krnn oni
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher " + name + "total salary earned so far " + salaryEarned;
    }

}
