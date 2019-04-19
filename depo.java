public class depo {
    
    public static void main (String[] args){

        kutu k1 = new kutu();
        kutu k2 = new kutu();
        
        k1.x = 5;
        k1.y = 10;
        k1.z = 15;
        k1.kirilir = true;

        k2.x = 20;
        k2.y = 1;
        k2.z = 20;
        k2.kirilir = false;
        
        System.out.println("k1 hacmi : " + (k1.x * k1.y * k1.z));
        System.out.println("k2 hacmi : " + (k2.x * k2.y * k2.z));
    }
}