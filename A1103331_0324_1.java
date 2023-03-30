import java.util.*;

class Animal{
    int weight;
    int speed;

    String name;
    double height;

    void show(){
        System.out.println("Name \theight\tweight\tspeed");
        System.out.println(name+ "\t" +height+ "\t" +weight+ "\t" +speed);
    }
 
    double distance(double x, double y){
        return x*y*speed;
    }

    double distance(double x){
        return x*speed;
    }
}

//main code
public class A1103331_0324_1 {
    public static void main(String [] args){
      Animal animal1, animal2, animal3, animal4;

      animal1 = new Animal();
      animal2 = new Animal();
      animal3 = new Animal();
      animal4 = new Animal();

      animal1.name = "Monkey";
      animal1.height = 1.1;
      animal1.weight = 52;
      animal1.speed = 100;
      animal1.show(); 
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter time : ");
      double x = sc.nextDouble();
      System.out.print("Enter acceleration : ");
      double y = sc.nextDouble();
      System.out.println("Monkey distance: " + animal1.distance(x, y));
      System.out.println();

      animal2.name="Donkey";
      animal2.height = 1.5;
      animal2.weight = 99;
      animal2.speed = 200;
      animal2.show(); 
      System.out.print("Enter time : ");
      double a = sc.nextDouble();
      System.out.print("Enter acceleration : ");
      double b = sc.nextDouble();
      System.out.println("Donkey distance: " + animal2.distance(a, b));
      System.out.println();

      animal3.name = "Aina";
      animal3.height = 1.7;
      animal3.weight = 48;
      animal3.speed = 120;
      animal3.show(); 
      System.out.print("Enter time : ");
      double c = sc.nextDouble();
      System.out.print("Enter acceleration : ");
      double d = sc.nextDouble();
      System.out.println("Donkey distance: " + animal3.distance(c, d));
      System.out.println();

      animal4.name = "Aisha";
      animal4.height = 1.7;
      animal4.weight = 50;
      animal4.speed = 120;
      animal4.show(); 
      System.out.print("Enter time : ");
      double e = sc.nextDouble();
      System.out.print("Enter acceleration : ");
      double f = sc.nextDouble();
      System.out.println("Donkey distance: " + animal4.distance(e, f));
      System.out.println();

    }

}