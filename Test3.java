public class Test3{

    public static boolean Bir(int a){
        System.out.println("Kirmizi");
        return a > 1;
    } 
    public static boolean iki(int a){
        System.out.println("Mavi");
        return a > 2;
    }

    public static void main(String args[]){
        if(Bir(0) && iki(3)){
            System.out.println("Yesil");
        }
        else{
            System.out.println("sari");
        }
        if(Bir(2) || iki(5)){
            System.out.println("Turuncu");
        }
        else{
            System.out.println("Mor");
        }
    }
}