public class cars{

    public static void main(String[] args){

        car audi = new car();
        car bmw  = new car();
        car fox  = new car();

        audi.model = 2010;
        audi.speed = 240;
        audi.color = 'r';
        

        bmw.model = 2012;
        bmw.speed = 260;
        bmw.color = 'b';

        fox.model = 2004;
        fox.speed = 300;
        fox.color = 'o';

        System.out.println("The audi model is :" + (audi.model));
        System.out.println("The audi speed is :" + (audi.speed));
        System.out.println("The audi color is :" + (audi.color));
        System.out.println("The bmw model is :" + (bmw.model));
        System.out.println("The bmw speed is :" + (bmw.speed));
        System.out.println("The bmw color is :" + (bmw.color));
        System.out.println("The fox model is :" + (fox.model));
        System.out.println("The fox speed is :" + (fox.speed));
        System.out.println("The fox color is :" + (fox.color));
    }
}