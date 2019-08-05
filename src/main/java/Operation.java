import java.util.Scanner;

public class Operation{
    private char ch;
    Scanner sc = new Scanner(System.in);


    public char getCh() {
        return ch;
    }

    {
        System.out.println("Укажите операцию: + or - or / or *");
    }
    public void setCh() {

        while ((ch != '+') & (ch != '-') & (ch != '/') & (ch != '*')) {
            this.ch = sc.next().charAt(0);

            if((ch != '+') & (ch != '-') & (ch != '/') & (ch != '*')){
                System.out.println("Введены некорректные символы. Укажите операцию: + or - or / or *");
            }
        }


        if (ch == '+'){
            Add add = new Add();
            int a = add.getA();
            System.out.println(a.Add());

        }
    }
}












