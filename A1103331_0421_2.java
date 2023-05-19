import java.util.*;

public class A1103331_0421_2 {
    public static void main (String[] argv){
        int date, month, year;

        System.out.print("Please enter the date with a format like this (YYYY/MM/DD or MM/DD/YYYY): ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] parts = input.split("/");
        
        if(parts.length == 3 && parts[0].length() == 4){
            year = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            date = Integer.parseInt(parts[2]);
        
        }else if(parts.length == 3 && parts[2].length() == 4){
            year = Integer.parseInt(parts[2]);
            month = Integer.parseInt(parts[0]);
            date = Integer.parseInt(parts[1]);
        
        }else{
            System.out.println("Not valid");
            return;
        }

        System.out.println("Year    : " +year);
        System.out.println("Month   : " +month);
        System.out.println("Date    : " +date);
    
    }
}