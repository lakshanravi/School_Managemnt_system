package org.example;

import java.util.List;

public class School {

  //school can  contain many students and teachers.
//but we do nt know exact number of teachers. therefor we cant use array. array has fixed length no. Arraylist is better
    private List <Teacher> teachers;
    private List  <Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //new school object is creating
    //pass arraylist of students and teachers
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;

        //intially 0i
        totalMoneyEarned =0;
        totalMoneySpent=0;
    }


    //this returns list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }


    //add teachers to schoool. classname ekai variable ekai deenne
    public void addTeacher(Teacher teacher) {
        //adding item to arraylist
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public  static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


    //teacher salary gewnn vitri spent wenne
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
