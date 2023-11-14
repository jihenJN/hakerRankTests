import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner (System.in);
        int day = input.nextInt();
        int month =  input.nextInt();
        int year = input.nextInt();
        System.out.println(findDay(month,day,year));

    }

    public static String findDay(int month, int day, int year) {
        final String[]  days={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        String weekDay="";
        int last2digit = year%100;
        int formula = day + codeMonth(month)+ codeYear(year)+ last2digit + (last2digit/4);
        int codeDay = formula % 7;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && (month == 1 || month == 2)) {
            weekDay = days[codeDay - 1];
        } else {
            weekDay = days[codeDay];
        }

        return weekDay;
    }


  public static int codeMonth(int month){

      int code ;
      final int[] monthChart = {0,3,3,6,1,4,6,2,5,0,3,5};
      code = monthChart[month-1];
      return code;

  }


   public static int codeYear(int year){

      int code=-1 ;
      int[] n={1,2,3,4,5,6,7,8,9};
     
       for(int i=0; i<n.length;i++){
        if(year>=(2000+(400*n[i])) &&  year<=(2099+(400*n[i]))) 
        code=6;
        else if (year>=(2100+(400*n[i])) &&  year<=(2199+(400*n[i]))) 
        code=4;
        else if (year>=(2200+(400*n[i])) &&  year<=(2299+(400*n[i]))) 
        code=2;
        else if (year>=(2200+(400*n[i])) &&  year<=(2299+(400*n[i]))) 
        code=0;
       }
  
      return code;

  }

}
