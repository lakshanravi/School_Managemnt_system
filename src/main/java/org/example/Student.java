package org.example;
/** this cls is responsible for keep the track of student */
public class Student {
    /** for protecting accessing from other classes*/
    private int id;
    private  String name;
    private int grade;
    private  int feesPaid;
    private  int feesTotal;

    public  Student(int id,String name,int grade){
        feesPaid = 0;  //initially it is 0, every student need to pay 30000 per year
       feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade=grade;
    }

    //used to update th e students grade
    public void setGrade(int grade){
        this.grade=grade;
    }

    //add the fee to the feespaid
    //masen masett gewn tika add krnw paid ekt
    //feespaid = feespaid + fees
    public  void  payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(fees);
    }

    //get krnna value getter oni


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    //get fees paid by the students
    public int getFeesPaid() {
        return feesPaid;
    }


    //get teh total fees of student
    public int getFeesTotal() {
        return feesTotal;
    }
  public int getRemainingFees(){
        return  feesTotal-feesPaid;
  }


  //ctrl+0
    //tostring
    //student details return krnn hdnnn
    @Override
    public String toString() {
        return "student name"+ name + " Total fees paid so far " + feesPaid +
                "";
    }
}
