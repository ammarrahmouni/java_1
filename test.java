public class test{
    public static void main(String [] args){
        object1 r = new object1(0);
        int x ;
        for(int i = 0; i < 2; i++){
           x = i;
            System.out.println("x = " + x);   
        }
        {
            int a;
            {
                a = 1;
                System.out.println(a);
            }
            System.out.println(a);
        }
    }
}