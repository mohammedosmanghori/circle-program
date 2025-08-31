import java.util.*;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of circle:");
        int diameter = sc.nextInt();
        double radius = diameter/2.0;
        double area = 3.14*radius*radius ;
        System.out.println("Radius of circle is = " + radius);
        System.out.println("Area of circle is = " + area);
    

    }
}