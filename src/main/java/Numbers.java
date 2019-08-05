import java.util.Scanner;

public class Numbers  {

    private int i;
    private int y;
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Введите числа:");
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
