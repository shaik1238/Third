public class javademo {
    int a = 4;
    int b = 5;
    int c =a+b;
    void display()
    {
        System.out.println(c);
    }
    void msg()
    {
        System.out.println("This is the message");
    }
    void Tax()
    {
        System.out.println("The Tax collected");
    }
    void Wax()
    {
        System.out.println("The wax collected");
    }
    public static void main(String []args)
    {
        javademo j = new javademo();
        j.display();
        j.msg();
        j.Tax();
        j.Wax();
    }

}
