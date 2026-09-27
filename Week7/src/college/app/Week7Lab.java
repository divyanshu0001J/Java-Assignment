package college.app;

import college.model.*;
import college.util.*;

public class Week7Lab
{
    public static void main(String[] args)
    {
        System.out.println("TASK 1");

        String text=TextUtils.normalizeName("  asha   nair ");
        System.out.println(text);

        text=TextUtils.normalizeName("DAVID");
        System.out.println(text);

        System.out.println("Successful normalizations: "+TextUtils.getcount());

        System.out.println("\nTASK 2");

        Person[] pr={
            new Person(),
            new Student("Himanshu"),
            new Instructor()
        };

        for(int i=0;i<pr.length;i++)
        {
            pr[i].describeRole();
        }

        // pr[1].submitAssignment();
        // This gives a compile-time error because submitAssignment()
        // is in Student but not in Person.

        if(pr[1] instanceof Student)
        {
            Student s=(Student)pr[1];
            System.out.println("Assignment submitted: "+s.submitAssignment());
        }

        // Instructor ins=(Instructor)pr[1];
        // This would cause ClassCastException because pr[1] contains
        // a Student object, not an Instructor.

        System.out.println("\nTASK 3");

        String[] marks={"85","abc","150"};

        for(int i=0;i<marks.length;i++)
        {
            try
            {
                Student s=new Student("Rahul");
                int mark=Integer.parseInt(marks[i]);

                s.setMark(mark);

                System.out.println("Mark "+marks[i]+" is valid");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid mark: "+marks[i]+" is not a number");
            }
            catch(InvalidStudentDataException e)
            {
                System.out.println("Invalid mark: "+e.getMessage());
            }
            finally
            {
                System.out.println("Validation attempt complete");
            }
        }
    }
}
