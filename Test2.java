public class Test2{
    public static int hesap(int a, int b){
        int t = 0;
        t = (a + b);
        System.out.println(t);
        return t;
    }
    public void uyari(){
        System.out.println("DIKKAT");
    }

    public static void main(String[] args){
        
        hesap(4, 4);
        Test2.hesap(4, 4);
        System.out.println(Test2.hesap(4, 4));
        System.out.println(hesap(4, 4));

        Test2 e = new Test2();
        e.uyari();
    }
}