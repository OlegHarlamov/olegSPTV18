package Metodi;

import java.util.Date;

public class Employee {
       int code;
       String presonalID;
           String lastName;
       String firstName;
       double salary;
       Date hiredDate;
       public void PrintInfo(){
       System.out.printf("Employee (s%): %s %s %n\t%.2f%n\t%tF%n", presonalID, lastName, firstName, salary, hiredDate);
       }
       public String getGender(){
       if (presonalID.charAt(0)=='3' || presonalID.charAt(0)=='5')
           return "Male";
       else
       return "Female";
       }
}
