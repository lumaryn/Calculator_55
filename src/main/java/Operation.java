import java.util.Scanner;

 class Operation {
    private char ch;
    private int a;
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

            if ((ch != '+') & (ch != '-') & (ch != '/') & (ch != '*')) {
                System.out.println("Введены некорректные символы. Укажите операцию: + or - or / or *");
            }
        }
    }

     public int getResult(int i, int y, char x)
     {

         if (x == '+') {
             Add add = new Add();
             int a = add.getA(i, y);
             this.a=a;
         }
         else if (x == '-') {
             Subtr subtr = new Subtr();
             int a = subtr.getA(i, y);
             this.a=a;
         }
         else if (x == '*') {
             Mult mult = new Mult();
             int a = mult.getA(i, y);
             this.a=a;
         }
         else if (x == '/') {
             Div div = new Div();
             int a = div.getA(i, y);
             this.a=a;
         }
         return a;
     }
 }













