public class loop_while{

    public static void loop(int x)
    {
        while(x != 21)
        {
            if(x >= 21)
            {
                System.out.println("The number must be less than 20!");
                break;
            }
            else
            {
                System.out.println(x);
                x++;
            }
        }
    }
    public static void loop1(int y)
    {
        while(true)
        {
            if(y < 10)
            {
                System.out.println(y);
                
                                
            }
            else if(y > 10)
            {
                System.out.println("The number must be less than 10!");
                break;
            }
            else
            {
                break;
            }
            y++;
        }
    }
    public static void main(String[] args){

        loop(1);
        System.out.println("--------------------");
        loop1(0);
    }
}