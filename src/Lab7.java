//
//import java.io.*;
//import java.util.*;
//
//class Lab7 {
//	static int product(int x, int y) {
//
//		if (x < y)
//			return product(y, x);
//
//		else if (y != 0)
//			return (x + product(x, y - 1));
//
//		else
//			return 0;
//	}
//
//	public static void main(String[] args) {
//		int x = 5, y = 2;
//		System.out.println(product(x, y));
//	}
//
//}
//
//package lab7;
//
//public class iremsila2 {
//		void reverse(String str)
//		{
//			if ((str==null)||(str.length() <= 1))
//			System.out.println(str);
//			else
//			{
//				System.out.print(str.charAt(str.length()-1));
//				reverse(str.substring(0,str.length()-1));
//			}
//		}
//		
//		public static void main(String[] args)
//		{
//			String str = "irem";
//			iremsila2 obj = new iremsila2();
//			obj.reverse(str);
//		}
//	}

public class Lab7 {
  
    // main driver method
    public static void main(String[] args)
    {
        int day = 2;
        String dayType;
        String dayString;
  
        // Switch case
        switch (day) {
  
        // Case
        case 1:
            dayString = "Monday";
            break;
  
        // Case
        case 2:
            dayString = "Tuesday";
            break;
  
            // Case
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Invalid day";
        }
  
        switch (day) {
            // Multiple cases without break statements
  
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            dayType = "Weekday";
            break;
        case 6:
        case 7:
            dayType = "Weekend";
            break;
  
        default:
            dayType = "Invalid daytype";
        }
  
        System.out.println(dayString + " is a " + dayType);
    }
}