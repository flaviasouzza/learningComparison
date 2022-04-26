package Logicadeprogramacao;

public class IncomeTax {
    public static void main (String[] args) {
        double salary =  2350D;

        double percentage1 = 7.5;
        double resultePercentage1= salary * percentage1 / 100;

        double percentage2 = 15;
        double resultePercentage2 = salary * percentage2 / 100;

        double percentage3 = 22.5;
        double resultePercentage3 = salary * percentage3 / 100;

        double percentage4 = 27.5;
        double resultePercentage4 = salary * percentage4 / 100;

        if (salary < 1903.98){
            System.out.println("Exempt");
            }

        else if ( salary >= 1903.99 && salary <= 2826.65 ){
            System.out.println("7.5% is " + resultePercentage1);
        }

        else if ( salary >= 2826.66 && salary <= 3751.05){
            System.out.println("15% is " + resultePercentage2);
        }

        else if ( salary >= 3751.06 && salary <= 4664.68){
            System.out.println("22.5% is " + resultePercentage3);
        }

        else {
            System.out.println("27.5% is " + resultePercentage4);
        }
    }
}
