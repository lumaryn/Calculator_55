class Calculator {
    public static void main(String[] args) {

        Numbers num = new Numbers();
        num.setI();
        num.setY();

        Operation op = new Operation();
        op.setCh();
        int a = op.getResult(num.getI(), num.getY());
        System.out.println("result: "+ a);

        Continue conti = new Continue();

        if (conti.getCont() != 'n' | conti.getCont() != 'N') {
            Continue contin = new Continue();
            int c = contin.Again(a);
            System.out.println("new result: "+ c);
            a = c;
        }
    }
}