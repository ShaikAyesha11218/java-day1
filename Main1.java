import java.util.*;
public class Main1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String name");
        String str=sc.nextLine();
        System.out.println("length:"+str.length());
        System.out.println("lowercase:"+str.toLowerCase());
        System.out.println("uppercase:"+str.toUpperCase());
        System.out.println("equals:"+str.equals("orange"));
        System.out.println("compareTo:"+str.compareTo("mango"));



    }    
    
    
}
