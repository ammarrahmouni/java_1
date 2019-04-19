import java.util.Scanner;

public class GirisFonk{
    public static void main(String[] args){
        Scanner reed = new Scanner(System.in);
        String name;
        int age;
        float salary;


        System.out.println("Please Enter Your Name:");
        name = reed.next();
        System.out.println("Please Enter Your Age:");
        age = reed.nextInt();
        System.out.println("Please Enter Your Salary:");
        salary = reed.nextFloat();
        
        System.out.println("------------------");
        
System.out.println("Your name is: " + name + " ,your age is: " + age + " and your salary is : " + salary);


    }
}