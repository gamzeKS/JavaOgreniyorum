import java.util.Scanner;


public class BedenIndex {
    public static void main (String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("kilonuzu giriniz:");
        int kilo= scanner.nextInt();
        System.out.print("boyunuzu giriniz (ornek:1,74) :");

        double boy= scanner.nextDouble();


        double bki = (kilo / (boy*boy));

        if(bki < 18.5){
            System.out.println("--zayif");}

        else if (bki>=18.5 && bki <=25.0){
            System.out.println("--normal");}

        else if (bki>25.0 && bki <=30.0){
            System.out.println("--fazla kilo");}

        else
            System.out.println("--obez");
    }
}


