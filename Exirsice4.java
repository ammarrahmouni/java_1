public class Exirsice4{
    public static int [] mulArray(int []a, int []b){
        if(a.length != b.length)
            return null;
        int c[] = new int[a.length];
        for(int i = 0; i < c.length; i++)
        {
            c[i] = a[i] * b[i];
        }
        return c;
    }
    public static void main(String[] args){
        int x[] = {1, 3, 6, 6, 10, 1};
        int y[] = {5, 7, 2, 3, 8, 7}; 
        
        int z[] = mulArray(x, y);
       if(z != null)
       {
        for(int i : z)
        {
            System.out.println(i);
        }
       }
       else 
        System.out.println("Array is NULL");
    }
}