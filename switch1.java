package access;

import java.util.Scanner;

public class switch1{

    public static void main(String[] args){
    
        object1 test = new object1(600);
        int test1 = test.get_speed();
        switch(test1)
        {
            case 100 :
            System.out.println("The speed is 100Km");
            break;
            case 50 :
            case 200:
            System.out.println("The speed is between 50 and 200 km");
            break;
            default : 
            System.out.println("The speed is None!");
        }
        Scanner reed = new Scanner(System.in);
        int ay;
        System.out.println("Pleast Enter The month number:");
        ay = reed.nextInt();
        switch(ay)
        {
            
            case 1: System.out.println("The month is ocak");
            case 2: System.out.println("The month is subat");
            case 3: System.out.println("The month is mart");
            case 4: System.out.println("The month is nisan");
            case 5: System.out.println("The month is mayis");
            case 6: System.out.println("The month is haziran");
            case 7: System.out.println("The month is temmuz");
            case 8: System.out.println("The month is augustus");
            case 9: System.out.println("The month is eylul");
            case 10: System.out.println("The month is ekim");
            case 11: System.out.println("The month is kasim");
            case 12: System.out.println("The month is aralik");
            default : System.out.println("Please The Number between 1 to 12");
        }


    }
}