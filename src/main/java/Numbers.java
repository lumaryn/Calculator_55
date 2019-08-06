import java.util.Scanner;

 class Numbers  {

    private int i;
    private int y;
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Введите число:");
    }
    public int getI() {
        return i;
    }
    public void setI() {
        this.i = sc.nextInt();
    }
    public int getY() {
        return y;
    }
    public void setY() {
        this.y = sc.nextInt();
    }
}
