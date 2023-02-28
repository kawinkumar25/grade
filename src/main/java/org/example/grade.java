package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Grade {


    public static void main (String[] args)
    {
        Logger l = Logger.getLogger("kawin");
        Scanner inputobj =new Scanner(System.in);

        Scanner inp =new Scanner(System.in);
        l.info("Enter name:");
        String name=inputobj.next();
        l.info("Enter grade  level:");
        String gradeLevel=inputobj.next();
        l.info("Enter gpa:");
        float gpa=inputobj.nextFloat();
        Greadopertions gradeobj = new Greadopertions(name,gradeLevel,gpa);
        l.info("Do you want to update your gpa yes->1/no->2 ?");

        int choice=inp.nextInt();
        if(choice==1)
        {
            gradeobj.update();
            gradeobj.show();
        }
        else if(choice==2)
        {
            gradeobj.show();
        }
        else
        {
            l.info("Sorry you have entered worng choice!!");
        }
    }
}
