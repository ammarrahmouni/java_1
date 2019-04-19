public class Ders1{
    public static void main(String[] args){
        int number1 = 5;
        int number2 = 5;
        
//هنا يقوم بالزيادة اولا ثم يخزن القيمة بالمتغير الجديد والقديم
        int number3 = ++number1; 
// هنا يقوم بتخزين القيمة القديمة بالمتغير الجديد ثم يقوم بزيادة واحد ويصبح قيمته القديمة بعد الزيادة 
        int number4 = number2++;

        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);
        System.out.println("number3: " + number3);
        System.out.println("number4: " + number4);
        System.out.println("---------------");

        int number5 = 10;
        int number6 = 10;

        int number7 = --number5;
        int number8 = number6--;

        System.out.println("number5: " + number5);
        System.out.println("number6: " + number6);
        System.out.println("number7: " + number7);
        System.out.println("number8: " + number8);
        System.out.println("---------------");

        int top  = ++number7 + number8++;
        int top1 = --number2 + number5--;
        int top2 = number3-- - ++number4;
        int top3 = ++number8 - --number1; 

        System.out.println("top: " + top);
        System.out.println("top1: " + top1);
        System.out.println("top2: " + top2);
        System.out.println("top3: " + top3);
        System.out.println("---------------");
    }
}