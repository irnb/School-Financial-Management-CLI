package com.company;
import java.util.List;
import java.util.Scanner;

public class School {

    private String Name;
    private List<Teacher> Teachers  ;
    private List<Student> Students ;
    private static int TotalMoneyEarnedShouldBeEarned;
    private static int TotalMoneyEarned ;
    private static int  TotalMoneySpendShouldBeSpend;
    private static int  TotalMoneySpend ;

    public School(String Name ,List<Teacher> Teachers, List<Student> Students) {
        this.Name = Name ;
        this.Teachers = Teachers;
        this.Students = Students;

    }



    static void CalculateTotalMoneyShouldBeEarned(int amount){
        TotalMoneyEarnedShouldBeEarned += amount ;

    }
    static void CalculateTotalMoneyEarned(int amount){
        TotalMoneyEarned += amount ;

    }
    static void CalculateTotalMoneyShouldBeSpend(int amount){
        TotalMoneySpendShouldBeSpend += amount ;
    }
    static void CalculateTotalMoneySpend(int amount){
        TotalMoneySpend += amount ;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Teacher> getTeachers() {
        return Teachers;
    }

    public void AddTeachers(Teacher teachers) {
        this.Teachers.add(teachers);
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void AddStudents(Student students) {
        this.Students.add(students)  ;
    }

    public  int getTotalMoneyEarnedShouldBeEarned() {
        return TotalMoneyEarnedShouldBeEarned;
    }


    public  int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }



    public  int getTotalMoneySpendShouldBeSpend() {
        return TotalMoneySpendShouldBeSpend;
    }



    public  int getTotalMoneySpend() {
        return TotalMoneySpend;
    }


}
