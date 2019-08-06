class Calculator {
    public static void main(String[] args) {

        Numbers num = new Numbers();
        num.setI();
        num.setY();

        int num1 = num.getI();
        int num2 = num.getY();

        Operation op = new Operation();
        op.setCh();
        char x = op.getCh();
        int a = op.getResult(num1, num2, x);


    /*    if (x == '+') {
            Add add = new Add();
            int a = add.getA(num1, num2);
            System.out.println("result "+ a);
        }
        else if (x == '-') {
            Subtr subtr = new Subtr();
            int a = subtr.getA(num1, num2);
            System.out.println("result "+ a);
        }
        else if (x == '*') {
            Mult mult = new Mult();
            int a = mult.getA(num1, num2);
            System.out.println("result "+ a);
        }
        else if (x == '/') {
            Div div = new Div();
            int a = div.getA(num1, num2);
            System.out.println("result "+ a);
        }


    Operation operation = new Operation();
    int a = operation.getResult(num1, num2, x);*/

        System.out.println(num1+" "+num2);
        System.out.println(x);
        System.out.println("result "+ a);

    }
}
