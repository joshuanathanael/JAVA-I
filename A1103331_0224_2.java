import java.util.*;

public class A1103331_0224_2{
       public static void main(String[] argv){
      
       float celcius, convert;
       System.out.println("Please input the degree in Celcius : ");
       Scanner sc = new Scanner(System.in);
       celcius = sc.nextFloat();

       convert = celcius * 9/5 + 32;
    
       System.out.println(celcius+" celcius = " +convert+ " fahrenheit");
       }
}