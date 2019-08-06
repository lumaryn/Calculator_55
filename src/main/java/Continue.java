class Continue extends Operation {
    private int s;
    private char cont;


    public int Again(int a){

        System.out.println("Введите 'Y', если хотите продолжить действия с полученным числом: "+a+"  или 'N'-обнулить");

        char cont = sc.next().charAt(0);
        this.cont = cont;

        if (cont == 'Y' || cont == 'y'){
            setCh();
            Numbers num = new Numbers();
            num.setI();
            int s = getResult(a, num.getI());
            this.s = s;
        }
        else {
            System.out.println("Вы закончили операцию");
             }
        return s;
    }

    public char getCont() {
        return cont;
    }
}