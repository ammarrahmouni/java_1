import java.util.Scanner;

public class ReadClass{
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
/*
    You can now read in different kinds of input data that the user enters. 
    Here are some methods that are available through the Scanner class:
    Read a byte - nextByte()
    Read a short - nextShort()
    Read an int - nextInt()
    Read a long - nextLong()
    Read a float - nextFloat()
    Read a double - nextDouble()
    Read a boolean - nextBoolean()
    Read a complete line - nextLine()
    Read a word - next()
*/