import java.util.Scanner;

public class Age{
    public static void main(String[] args){
        Scanner reed = new Scanner(System.in);
        int year;
        int brith;
        int user_age;

        System.out.print("Plese Enter The Now Year:");
        year = reed.nextInt();
        System.out.print("Plese Enetr Your Brithyear:");
        brith = reed.nextInt(); 
        user_age = year - brith;

        System.out.println("Your age is :" + user_age + " Year.");
        System.out.println("Thank You!");

    }
}