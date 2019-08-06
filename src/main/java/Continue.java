class Continue extends Operation {
   private int s;
   private char cont;


    public int Again(int a){

        System.out.println("Введите 'Y', если хотите продолжить действия с полученным числом: "+a+"  или 'N'-выход");

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
            s=0;
        }
        return s;

        }

    public char getCont() {
        return cont;
    }
}


