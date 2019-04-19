public class loop_for{

    public static void rakam(int x)
    {
        if(x > 100)
        return ;
        for(int i = x; i <= 100; i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        for(int i = 1; i < 15; i++)
        {
            
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
                

            }
            System.out.println(' ');
        }
        System.out.println("----------");

        rakam(0);
        
        int z = 5;
        for(;;)
        {
            if(z < 8)
            {
                System.out.println("Hello");
                z++;
            }
            else
            break;
        }
    }
}