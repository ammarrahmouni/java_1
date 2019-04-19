import java.util.*;
public class Exirsice2{
    
    public static void main(String args[]){
        double h1, h2;
        kutu k = new kutu();
        Scanner oku = new Scanner(System.in);
        System.out.println("birinci deger giriniz:");
        k.x  = oku.nextInt();
        System.out.println("ikinci deger giriniz:");
        k.y  = oku.nextInt();
        System.out.println("ucunuc deger giriniz:");
        k.z  = oku.nextInt();
        h1 = hesap1.hacim1(k.x, k.y, k.z);
        hesap2 u = new hesap2();
        h2 = u.hacim2(k);
        System.out.println("hacim1 = " + h1);
        System.out.println("hacim2 = " + h2);
    }
}
class kutu{
    double x, y, z;
}
class hesap1{
    public static double hacim1(double a, double b, double c){
        return a * b * c;
    }
}
class hesap2{
    public double hacim2(kutu m){
        return m.x * m.y * m.z;
    }
}