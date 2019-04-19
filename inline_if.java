public class inline_if{

    public static void main(String[] args){

        object1 test = new object1(350);
        // inline_if الشرط السطري المختصر
        int x = (test.get_speed() > 200) ? test.get_speed() : 0;
        System.out.println(x);
    }
}