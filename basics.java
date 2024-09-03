/* Assignments

(simple program)
1. Write a program scan number of years and convert in month
year =2
month=24
*/
import java.util.*;

public class basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        int month = 12*year;

        System.out.println("Converted into months is : " + month);
        sc.close();
    }
}