import java.util.Scanner;

 class Operation {
    private char ch;
    private int a;
    Scanner sc = new Scanner(System.in);

    protected void setCh() {
        System.out.println("Укажите операцию: + or - or / or *");
        while ((ch != '+') & (ch != '-') & (ch != '/') & (ch != '*')) {
            this.ch = sc.next().charAt(0);

            if ((ch != '+') & (ch != '-') & (ch != '/') & (ch != '*')) {
                System.out.println("Введены некорректные символы. Укажите операцию: + or - or / or *");
            }
        }
    }

     protected int getResult(int i, int y)
     {
         if (ch == '+') {
             Add add = new Add();
             int a = add.getA(i, y);
             this.a=a;
         }
         else if (ch == '-') {
             Subtr subtr = new Subtr();
             int a = subtr.getA(i, y);
             this.a=a;
         }
         else if (ch == '*') {
             Mult mult = new Mult();
             int a = mult.getA(i, y);
             this.a=a;
         }
         else if (ch == '/') {
             Div div = new Div();
             int a = div.getA(i, y);
             this.a=a;
         }
         else{
             System.out.println("Произошла неведомая ошибка");
         }
         return a;
     }
 }













