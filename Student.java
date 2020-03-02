package com.company;

public class Student {
    private String FName ;
    private String LName ;
    private String StudentId;
    private int EntryYear ;
    private int NumberOfCourse ;
    private int FeeShouldBePayed ;
    private int FeePayed;
    private int FeeForEachLesson ;




    public Student(String FName, String LName,int EntryYear, int NumberOfCourse, int FeeForEachLesson ) {
        this.FName = FName;
        this.LName = LName;
        this.EntryYear = EntryYear;
        CreateStudentId();
        this.NumberOfCourse = NumberOfCourse;
        this.FeeForEachLesson = FeeForEachLesson ;
        CalculateFeeShouldBePayed();
        this.FeePayed = 0 ;
    }


    private  void CreateStudentId(){
        StudentId = FName.charAt(0) +""+ LName.charAt(0) + (EntryYear % 100) ;
    }
    private void CalculateFeeShouldBePayed (){
        FeeShouldBePayed = FeeForEachLesson * NumberOfCourse ;
        School.CalculateTotalMoneyShouldBeEarned(FeeShouldBePayed);
    }



    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
        CreateStudentId();
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
        CreateStudentId();
    }

    public String getStudentId() {
        return StudentId;
    }


    public int getEntryYear() {
        return EntryYear;
    }

    public void setEntryYear(int entryYear) {
        EntryYear = entryYear;
        CreateStudentId();
    }

    public int getNumberOfCourse() {
        return NumberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        NumberOfCourse = numberOfCourse;
        CalculateFeeShouldBePayed();
    }

    public int getFeeShouldBePayed() {
        return FeeShouldBePayed;
    }


    public int getFeePayed() {
        return FeePayed;
    }

    public void UpdateFeePayed(int feePayed) {
        FeePayed = feePayed;
        School.CalculateTotalMoneyEarned(FeePayed);
    }

    public int getFeeForEachLesson() {
        return FeeForEachLesson;
    }

    public void setFeeForEachLesson(int feeForEachLesson) {
        FeeForEachLesson = feeForEachLesson;
        CalculateFeeShouldBePayed();
    }
}
