public class car{

    int model;
    int speed;
    char color;
    int speedq;
    static int z;  // هذا المتغير خاص بهذا الكلاس ولا يجب استخدامه من قبل الكائنات التي يتم انشائهم من الكلاس 

    public void speeds(int s)
    {
        this.speedq = s;
    }
    public int getspeed()
    {
        return this.speedq;
    }


}