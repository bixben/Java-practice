class Hello
{

    public static void main(String args[])
    {
        //byte b= 127;
        int a=257;
        byte k=(byte)a;

        float f=5.6f;
        int t=(int)f;
        System.out.println(t);

        byte b=10;
        byte c=25;
        int result = b*c;//the type is changed to int because the result value goes out of the byte rage
        System.out.println(result);


    }
}
