public class DoWhile{
   public static void loop(int x)
    {
        if(x % 2 == 0)
        {
            int y = x * 5;
            do
            {
                System.out.println(y - 1);
                y--;
            }
            while(y > 100);
        }
        else
        {
            System.out.println("The figure must be even and the biggest than 100!");
        }

    }

    public static void main(String[] args){

       for(int i = 0; i < 10; i++)
       {
        loop(i);
        System.out.println("-----------");
       }
    }
}

