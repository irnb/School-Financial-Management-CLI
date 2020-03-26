package com.company;

public class Teacher {
    private String FName ;
    private String LName ;
    private String TeacherId ;
    private int YearOfExperience ;
    private int NumberOfClass ;
    private int CostForEachClass;
    private int SalaryShouldBePayed;
    private int SalaryPayed ;

    public Teacher(String FName, String LName, int yearOfExperience, int NumberOfClass,int CostForEachClass) {
        this.FName = FName;
        this.LName = LName;
        YearOfExperience = yearOfExperience;
        CreateTeacherId();
        this.NumberOfClass = NumberOfClass ;
        this.CostForEachClass =CostForEachClass ;
        CalculateSalaryShouldBePayed();
        this.SalaryPayed = 0;
    }
    private void CreateTeacherId(){
        TeacherId = FName.charAt(0)+""+LName.charAt(0)+YearOfExperience;
    }
    private void CalculateSalaryShouldBePayed (){
        SalaryShouldBePayed = NumberOfClass * CostForEachClass ;
        School.CalculateTotalMoneyShouldBeSpend(SalaryShouldBePayed);
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
        CreateTeacherId();
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
        CreateTeacherId();
    }

    public String getTeacherId() {
        return TeacherId;
    }


    public int getYearOfExperience() {
        return YearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        YearOfExperience = yearOfExperience;
        CreateTeacherId();
    }

    public int getNumberOfClass() {
        return NumberOfClass;
    }

    public void setNumberOfClass(int numberOfClass) {
        NumberOfClass = numberOfClass;
        CalculateSalaryShouldBePayed();
    }

    public int getCostForEachClass() {
        return CostForEachClass;
    }

    public void setCostForEachClass(int costForEachClass) {
        CostForEachClass = costForEachClass;
        CalculateSalaryShouldBePayed();
    }

    public int getSalaryShouldBePayed() {
        return SalaryShouldBePayed;
    }


    public int getSalaryPayed() {
        return SalaryPayed;
    }

    public void UpdateSalaryPayed(int salaryPayed) {
        SalaryPayed = salaryPayed;
        School.CalculateTotalMoneySpend(SalaryPayed);
    }

    @Override
    public String toString() {
        return "name : " + FName + " " + LName + ", number of class : " + NumberOfClass + ", Salary :" + NumberOfClass*CostForEachClass +"\n" ;
    }
}
