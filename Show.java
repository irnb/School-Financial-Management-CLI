package com.company;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Show {

    private  int counter = 0 ;
    private  int counterTwo = 0 ;

    List<Teacher> teacherList = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();
    Hashtable<String, Teacher> TeacherHashtable = new Hashtable<>();
    Hashtable<String, Student> StudentHashtable = new Hashtable<>();

    Scanner input = new Scanner(System.in);

    School EM = new School("Emam mahdi",teacherList ,studentList);

    public  void display(){
        boolean continueCheck = true ;

        do{
            System.out.println("##########################");
            System.out.println("Welcome to our services  #\n1 for School management  #\n2 for Teacher management #\n3 for Student management #\n4 for exit               #" );
            System.out.println("##########################");
            System.out.print("option : ");
            char check = input.next().charAt(0);
            System.out.println("--------------------------");
            switch (check){
                case '1':
                    displaySchoolManagement();
                    break;
                case '2':
                    displayTeacherManagement();
                    break;
                case '3':
                    displayStudentManagement();
                    break;
                case '4':
                    System.out.println("THANK YOU , FOR USING OUR SERVICES");
                    continueCheck = false ;
                    break;
                default:
                    System.out.println("PLEASE INPUT CORRECT PROMPT. TRY AGAIN");
            }
        }while (continueCheck);
    }

    private  void  displaySchoolManagement(){

        boolean continueCheck = true ;

        System.out.println("SCHOOL MANAGEMENT");
        System.out.println("'a' for show school name\n'b' for modify School name\n'c' for get teacher list \n" +
                "'d' for Add a teacher\n'e' for get Student list\n'f' for add a Student\n" +
                "'g' for get Total Money Should Be Earned \n'h' for show Total Money Earned \n" +
                "'i' for get Total Money Should Be Spent \n'j' for show total money spent \n'k' for help \n'l' for back main menu");
        do{

            System.out.println("--------------------------");
            System.out.print("option : ");
            char check = input.next().charAt(0);

            switch (check){
                case 'a':
                    System.out.println("the school name is : "+EM.getName());
                    break;
                case 'b':
                    input.nextLine();
                    System.out.println("modify School name =>");
                    System.out.print("Input the name for school you want :");

                    String newName = input.nextLine();
                    EM.setName(newName);
                    System.out.println("the school name now is : "+EM.getName());
                    break;
                case 'c':
                    System.out.println("teacher list =>");
                    System.out.println(EM.getTeachers());
                    break;
                case 'd':

                    input.nextLine();
                    String FName ;
                    String LName ;
                    String TeacherId ;
                    int YearOfExperience ;
                    int NumberOfClass ;
                    int CostForEachClass;

                    System.out.println("Add a teacher =>");
                    System.out.print("first name : ");
                    FName = input.nextLine();
                    System.out.print("last name : ");
                    LName = input.nextLine();
                    System.out.print("year of experience : ");
                    YearOfExperience = input.nextInt();
                    input.nextLine();
                    System.out.print("number of class :");
                    NumberOfClass = input.nextInt();
                    input.nextLine();
                    System.out.print("cost for each class :");
                    CostForEachClass = input.nextInt();
                    input.nextLine();
                    TeacherId = FName.charAt(0)+""+LName.charAt(0)+YearOfExperience ;

                    TeacherHashtable.put(TeacherId, new Teacher(FName , LName , YearOfExperience , NumberOfClass ,CostForEachClass));
                    teacherList.add(counter ,TeacherHashtable.get(TeacherId));
                    counter ++ ;
                    break;
                case 'e':
                    System.out.println("student list =>");
                    System.out.println(EM.getStudents());
                    break;
                case 'f':

                    input.nextLine();
                    String FNameS ;
                    String LNameS ;
                    String StudentId;
                    int EntryYear ;
                    int NumberOfCourse ;
                    int FeeForEachLesson ;

                    System.out.println("Add a student =>");
                    System.out.print("first name : ");
                    FNameS = input.nextLine();
                    System.out.print("last name : ");
                    LNameS = input.nextLine();
                    System.out.print("Entry year : ");
                    EntryYear = input.nextInt();
                    input.nextLine();
                    System.out.print("number of course :");
                    NumberOfCourse = input.nextInt();
                    input.nextLine();
                    System.out.print("cost for each class :");
                    FeeForEachLesson = input.nextInt();
                    input.nextLine();
                    StudentId = FNameS.charAt(0) +""+ LNameS.charAt(0) + (EntryYear % 100) ;
                    StudentHashtable.put(StudentId , new Student(FNameS ,LNameS , EntryYear , NumberOfCourse ,FeeForEachLesson));
                    studentList.add(counterTwo ,StudentHashtable.get(StudentId));
                    counterTwo ++ ;
                    break;

                case 'g':
                    System.out.println("Show total money should be earned =>");
                    System.out.println(EM.getTotalMoneyEarnedShouldBeEarned());
                case 'h':
                    System.out.println("Show total money earned =>");
                    System.out.println(EM.getTotalMoneyEarned());
                case 'i':
                    System.out.println("Show total money should be spent =>");
                    System.out.println(EM.getTotalMoneySpendShouldBeSpend());
                case 'j':
                    System.out.println("show total money spent =>");
                    System.out.println(EM.getTotalMoneySpend());
                case 'k':
                    System.out.println("##########################");
                    System.out.println("SCHOOL MANAGEMENT");
                    System.out.println("'a' for show school name\n'b' for modify School name\n'c' for get teacher list \n" +
                            "'d' for Add a teacher\n'e' for get Student list\n'f' for add a Student\n" +
                            "'g' for get Total Money Should Be Earned \n'h' for show Total Money Earned \n" +
                            "'i' for get Total Money Should Be Spent \n'j' for show total money spent \n'k' for help \n'l' for back main menu");
                    break;
                case 'l':
                    continueCheck =false ;
                    break;
                default:
                    System.out.println("PLEASE INPUT CORRECT PROMPT. TRY AGAIN");

            }
        }while (continueCheck);


    }


    private  void  displayTeacherManagement(){
    }


    private  void  displayStudentManagement(){
    }
}
