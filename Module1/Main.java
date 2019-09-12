import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(){
    Scanner a = new Scanner(System.in);
    String name;
    int age;
    String bg,grp;
    
    System.out.print("Enter your Name: ");
    name= a.nextLine();
    System.out.print("Enter your Blood Group: ");
    bg= a.nextLine();
    System.out.print("Enter your Age: ");
    age= a.nextInt();
    
    
    if(age>=20)
    grp="RED";
    else if(age>=15 && age<20)
    grp="Blue";
    else
    grp="Yellow";
    
    System.out.println("---------------------------------------------");
    System.out.println("Name:"+name+"\nAge:"+age+"\nBlood Group:"+bg);
    System.out.println("---------------------------------------------");
    System.out.println("Your group is "+grp);
    System.out.println("---------------------------------------------");
    a.close();
    
    
    } 
}
