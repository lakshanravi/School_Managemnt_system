package org.example;

public class Teacher {
    private  int id;
    private  String name;
    private  int salary;



    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public  void setSalary(int salary){
        this.salary = salary;
    }


}
