package access;

public class Array{

    // bu fonksiyon bir array dödürecek
    public static int[] creatArray(int size){
        int c[] = new int[size];
        return c;
    }
    // bu fonksiyon bir array dödürecek

    // bu fonksiyon bir array alacak
    public static void printarray(int [] a){
        for(int i : a)
        {
            System.out.println(i);
        }
    } 
    // bu fonksiyon bir array dödürecek

    public static void main(String[] args){
        
        //creat Array 1.yöntem
        int x[] = new int[4]; // Fixed size for Array
        x[0] = 1;
        x[1] = 10;
        x[2] = 7;
        x[3] = 50;
        //creat Array 1.yöntem
        System.out.println("Creat a new Array (int) with first way and Print Array elements");
        for(int i = 0; i < x.length; i++)
        {
            System.out.println(x[i]);
        }
        System.out.println("-------------");

        
        //creat Array 2.yöntem
        System.out.println("Creat a new Array (int) with secound way and Print Array elements");
        int y[] = {1, 14, 5, 9};
        //creat Array 2.yöntem 
        for(int i = 0; i < y.length; i++)
        {
            System.out.println(y[i]);
        }
        System.out.println("-------------");
        //creat Array 3.yöntem
        int dizi[];
        dizi = new int[] {1,6,7};
        //creat Array 3.yöntem 


        //creat Array to String
        String names[] = {"ammar", "ahmet", "asmma", "jad"};
        //creat Array to String
        System.out.println("Creat a new matrix (String) and Print Array elements");
        for(int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
        System.out.println("-------------");

        //creat Array by method
        int [] f = Array.creatArray(10);
        int [] r = Array.creatArray(5);
        //creat Array by method
        System.out.println("creat Array by method and this is Array length");
        System.out.println(f.length);
        System.out.println(r.length);
        System.out.println("-------------");

        // loop for Array(for each)
        System.out.println("New loop Way for Array");
        int u[] = {7, 9, 68, 2, 54};
        for(int w : u)
        {
            System.out.println(w);
        }
         // loop for Array(for each)
         System.out.println("-------------");

        //methoda bir array göndermek
        System.out.println("Send Array to method and this is Array elements");
        int h[] = {52, 25, 36, 6};
        Array.printarray(h);
        //methoda bir array göndermek
        System.out.println("-------------");

        // 2d bir Array üretmek
        System.out.println("Multiple sizes of Array : first way");
        int [][]t = {{1,6,8,9}, {8,9,4,100}, {45,63,2,58}};
        for(int i = 0; i < t.length; i++)
        {
            
            for(int j = 0; j < t[i].length; j++)
            {
                System.out.println(t[i][j]);
            }
        }
        // 2d bir Array üretmek
        System.out.println("-------------");

        // 2d bir Array üretmek 2.yöntem(Fixed size)
        System.out.println("Multiple sizes of Array : second way");
        int m[][] = new int[2][2]; // yani iki satır ve iki sütun bir array üretmektedir
        m[0][0] = 7;
        m[0][1] = 41;
        m[1][0] = 25;
        m[1][1] = 6;
        System.out.println(m[1][1]);
        // 2d bir Array üretmek 2.yöntem(Fixed size)
        System.out.println("-------------");
        //çok boyutlu dizi üretmek başka yolu
            System.out.println("Multiple sizes of Array : third way");
            int [][]xs = new int[4][];
            for(int i = 0; i < xs.length; i++)
            {
                xs[i] = new int[i + 2];
                for(int j = 0; j < xs[i].length; j++)
                {
                    xs[i][j] = (i + j) * 2;
                }
            }
            for(int i = 0; i < xs.length; i++)
            {
                for(int j = 0; j < xs[i].length; j++)
                {
                    System.out.print(xs[i][j] + "  ");
                }
            }
         //çok boyutlu dizi üretmek başka yolu
         System.out.println("\n-------------");
         //nesnelerden oluşan dizi(object Array)
         System.out.println("Object of Array");
         Object dizi1[] = new Object[4];
         dizi1[0] = 1;
         dizi1[1] = "ammar";
         dizi1[2] = 4.5;
         dizi1[3] = (int)dizi1[0] + (double)dizi1[2];
 
         for(Object w : dizi1)
            System.out.println(w);
        //nesnelerden oluşan dizi(object Array)
        System.out.println("-------------");
    }
}