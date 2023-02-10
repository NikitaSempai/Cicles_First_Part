public class Main {
    public static void main(String[] args) {
        allTasks();
    }


    public static void allTasks(){
        System.out.println("First task");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("Second task");
        for(int k = 10; k >= 1; k--){
            System.out.println(k);
        }
        System.out.println("Third task");
        for(int j = 0; j < 17; j++){
            if(j % 2 == 0){
                System.out.println(j);
            }
        }
        System.out.println("Fourth task");
        for(int d = 10; d >= -10; d--){
            System.out.println(d);
        }
        System.out.println("Fifth task");
        for (int l = 1904; l <= 2096; l+=4){
            System.out.println(l + " год является високосным");
        }
        System.out.println("Sixth task");
        for(int a = 1; a <= 14; a++){
            System.out.println(a * 7);
        }
        System.out.println("Seventh task");
        for(int t = 2; t <= 512; t*=2){
            System.out.println(t);
        }
        System.out.println("Eighth task");
        int monthPrice = 29000;
        int result = 0;
        for(int q = 1; q <= 12; q++){
            result += monthPrice;
            System.out.println("Месяц " + q + ", сумма накоплений равна " + result + " рублей");
        }
        System.out.println("Ninth task");
        int total = 0;
        for(int p = 1; p<=12; p++){
            total = total + total/100;
            total = total + monthPrice;
            System.out.println("Месяц " + p + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Tenth task");
        for(int z = 1; z <= 10; z++){
            System.out.println("2*" + z + "=" + z*2);
        }
    }
}