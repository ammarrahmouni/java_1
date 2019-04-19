public class break1{
    public static void main(String[] args){
        kir:
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < 100; i++){
                if(i == 9){
                    break kir;
                }
                System.out.println("i = " + i);
            }
            System.out.println("Donguden cikti");
            System.out.println("j = " + j);
        }
        System.out.println("Thanl you");
       

        kir1:
        for(int j = 0; j < 10; j++){
            System.out.println("-------------");
            for(int i = 0; i < 100; i++){
                if(i == 9){
                    continue kir1;
                }
                System.out.println("i = " + i);
            }
            System.out.println("Donguden cikti");
            System.out.println("j = " + j);
        }
        System.out.println("Thanl you");
    }
    
}