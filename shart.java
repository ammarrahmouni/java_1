public class shart {
     public static void main (String[] args){
         object1 mazda = new object1(50);
         int max = mazda.get_speed();
         if(max > 100)
         {
             System.out.println("Slow please!");
         }
         else if(max < 100)
         {
             System.out.println("plese hurry up!");
         }
         else 
         {
             System.out.println("None!");
         }
     }
}