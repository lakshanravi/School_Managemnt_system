package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //CREATING TEACHERS  one teacher at a time
        //But your school doesn’t want to just store lizzy — it wants to store all teachers together in a List<Teacher>.
        //That list is passed to your School class:

        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher meliissa = new Teacher(2,"Mellissa",700);
        Teacher vanderhorn = new Teacher(3,"vanderhorn",600);


        //And then add them to a list:
        List<Teacher>teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(meliissa);
        teacherList.add(vanderhorn);



        Student tamasha = new Student(1,"tamasha",4);
        Student rakshitha = new Student(2,"rakshitha",12);
        Student rabbi = new Student(3,"rabbi",5);


        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshitha);
        studentList.add(rabbi);

        //me list deka pass krnn onine school constructor ekt
        School ghs = new School(teacherList,studentList);



        tamasha.payFees(5000);
        System.out.println(tamasha.getRemainingFees());

        rakshitha.payFees(6000);
        System.out.println("earned money is $"+  ghs.getTotalMoneyEarned());


        System.out.println("--making ghs pay salary --");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to" + lizzy.getName() + "and now school has " + ghs.getTotalMoneyEarned());



        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to" + vanderhorn.getName() + "and now school has " + ghs.getTotalMoneyEarned());


        System.out.println(rakshitha);
        System.out.println(lizzy);

    }
}