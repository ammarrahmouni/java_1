public class Strg{
    public static void main(String[] args){
        String name = "My name is Ammar";
        int t = name.length();
        for(int i = 0; i < t; i++)
        {
            char s = name.charAt(i);
            if(s == ' ')
            {
                System.out.println("---");
            }
            System.out.println(s);
        }
        System.out.println("**********************");
        String test = "kkasjdh saldjl . sad; sad: sahdn alsdkh : qepojasd ;SA d: , alsdk";
        int x = test.length();
        int u = 1;
        for(int i = 0; i < x; i++)
        {
            
            char c = test.charAt(i);
            if(c != ' ' && c != '.' && c != ';' && c != ':' && c != ',')
            {
                
                System.out.print(u);
                System.out.print('.');
                System.out.println(c);
                u++;
            }
        }
        int toplam = u - 1;
        System.out.println("The total number of text characters is: " + toplam + " characters");
        System.out.println("Thank you!");
        
        
    }
}