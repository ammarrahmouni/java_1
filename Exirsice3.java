public class Exirsice3{
    // String To Array
    public static char [] stoarray(String a){
        char array[] = new char[a.length()];
        for(int i = 0; i < a.length(); i++)
        {
            array[i] = a.charAt(i);
            
        }
    
        return array;
    }
    // String To Array
    public static void main(String[] args){
        String text = "Hello world!";
        char chs[] = stoarray(text);
    
        for(char i : chs)
        {
            System.out.println(i);
        }
    }
}