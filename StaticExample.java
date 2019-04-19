public class StaticExample{
    public static void main(String[] args){

        int result = Calucature.add(10, 5);
        System.out.println(result);

        result = Calucature.sul(10, 5);
        System.out.println(result);

        result = Calucature.mul(10, 5);
        System.out.println(result);

        result = Calucature.div(10, 5);
        System.out.println(result);

    }
}
 class Calucature{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int sul(int a, int b)
    {
        return a - b;
    }
    public static int mul(int a, int b)
    {
        return a * b;
    }
    public static int div(int a, int b)
    {
        return a / b;
    }
}