import java.util.Scanner;
import java.lang.*;
public class AreaOfTriangle {
    public static void main(String args[]) {
        Scanner x=new Scanner(System.in);
        double a,b,c,S,Area;
        System.out.println("enter a, b &c : ");
        a=x.nextInt();
        b=x.nextInt();
        c=x.nextInt();
        S=(a+b+c)/2d;
        Area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("Area of the triangle is: "+Area);
    }
    
}
