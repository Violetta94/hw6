public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }
        //hw2

        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i%4==0 && i%100!=0 || i%400==0)
            System.out.println(i + " год високосный");
        }
        System.out.println();

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        //hw3

        System.out.println();

        int total=0;
        int part=29000;
        for (int month=1;month<=12; month++) {
            total = total + part;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }


         total=0;
         part=29000;
            for (int month=1;month<=12; month++) {
                total=(total+part);
                total=total+total/100;
                System.out.println("Месяц "+month+", сумма накоплений равна "+ total +" рублей" );
        }
    }
}