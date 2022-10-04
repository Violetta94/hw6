public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }
        //hw2

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год високосный");
        }
        System.out.println(" ");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        //hw3

        System.out.println(" ");

        int total=0;

        for (int i=1;i<=12; i++) {
            total = total + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }


        int total2=0;
        int part=29000;
            for (int i=1;i<=12; i++) {
                total2=(total2+part);
                total2=total2+total2/100;
                System.out.println("Месяц "+i+", сумма накоплений равна "+ total2 +" рублей" );
        }
    }
}