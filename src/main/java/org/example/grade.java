package org.example;

import java.util.Scanner;

public class grade {
    String name;
    String gradeLevel;
    float gpa;
    float Ugpa;
    int choice;

    Scanner i =new Scanner(System.in);
    Scanner s =new Scanner(System.in);
    grade()
    {
        System.out.println("Enter name:");
        name=s.next();
        System.out.println("Enter grade  level:");
        gradeLevel=s.next();
        System.out.println("Enter gpa:");
        gpa=i.nextFloat();

        System.out.println("Do you want to update your gpa yes->1/no->2 ?");
        choice=i.nextInt();
        if(choice==1)
        {
            update();
            show();
        }
        else
        {
            show();
        }


    }
    void update()
    {
        System.out.println("enter yur updated gpa");
        Ugpa=i.nextFloat();
        gpa=Ugpa;
    }
    void show()
    {
        System.out.println(name+" has GPA of "+gpa);
    }
    public static void main (String[] args)
    {
        grade a = new grade();
    }
}