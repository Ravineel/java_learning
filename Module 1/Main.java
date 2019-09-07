import java.io.*;
import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (Ravineel)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your private 

    public Main()
    {
       
       
       // initialise instance variables
       
    }
    public static void main(String[] args){
       
        //primitiv data types except string and 
        //how to store value and print them
        String name="India";
        int population = 12345678;
        float populationdensity =232.4f;
        double gdp = 2.5343;
        char currency='R';
        boolean issecular= true;
        if(issecular){
        System.out.println(name+" "+gdp);
        }
        
        
    //Implicit Conversion
    int radius =400;
    double newradius =radius; 
    //eg2:
    int rad=400;
    long  newrad=rad;
    System.out.println(newradius+" "+newrad);
    
    // Explicit conversion
    double diameter =3.78;
    int newDiameter = (int)diameter;
    //eg2:
    long diametre= 678667876678l;
    int newdia=(int)diametre;
    
    System.out.println(newDiameter+" "+newdia);
    
   //8 bits =1byte
   /*type=size(bits)
    * byte=8
    * short=16
    * int=32
    * long=64(xxxl)
    * float=32(x.xxf)
    * double=64
    * bool=1
    * char=16(eg:'$','a','3','\u20B9(unicode for rupees)')
    */
   
    //user input
    String Name;
    int pop;
    float popdensity;
    double GDP;
    char cur;
    boolean isSecular;
    Scanner scanner= new Scanner(System.in);
    System.out.print("Enter Country Name:");
    //Name=scanner.next();//only takes value till it gets space
    Name= scanner.nextLine();
    
    System.out.print("Enter population: ");
    pop=scanner.nextInt();//takes only integer value
    //similar for double scanner.nextDouble();
    System.out.print("Enter your country Symbol: ");
    cur=scanner.next().charAt(0);  //hello->cur will only store h
    
    
    System.out.println("Your country name is: "+Name);
    System.out.println("Your country population is: "+pop);
    System.out.println("Your country currency symbol  is: "+cur);
    
    scanner.close();//to avoid resource likage in future
    }

 
    
}
