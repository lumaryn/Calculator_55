public class Calculator {
    public static void main(String[] args) {

        Numbers num = new Numbers();

        num.setI();
        num.setY();

        int num1 = num.getI();
        int num2 = num.getY();



        Operation op = new Operation();
        op.setCh();
        char x = op.getCh();


        //int result = calc(num1,num2,operation);
        System.out.println(num1+" "+num2);
        System.out.println(x);
    }
}
