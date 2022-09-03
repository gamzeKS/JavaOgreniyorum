import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String işlemler =  "1- Toplama islemi \n"
                          +"2- Cikarma islemi\n"
                          +"3- Carpma  islemi\n"
                          +"4- Bolme   islemi ";
        System.out.println(işlemler);
        System.out.println("**********************************");
        System.out.print("yapmak istediginiz islemi seciniz:");
        String işlem= scanner.nextLine();

     int a;
     int b;

     switch (işlem){
         case "1":
             System.out.print("birinci sayi :");
               a = scanner.nextInt();

             System.out.print("ikinci sayi:");
              b = scanner.nextInt();


             System.out.print("sayilarin toplami:" + (      a+b) );
             break;

         case "2":
             System.out.print("birici sayı :");
              a = scanner.nextInt();

             System.out.print("ikinci sayı:");
              b = scanner.nextInt();


             System.out.print("sayilarin farki :" + (a-b) );
             break;
         case "3":
             System.out.print("birici sayi :");
             a = scanner.nextInt();

             System.out.print("ikinci sayi:");
             b = scanner.nextInt();


             System.out.print("sayilarin carpimi :" + (a*b) );
             break;
         case "4":
             System.out.print("birici sayi :");
             a = scanner.nextInt();

             System.out.print("ikinci sayi:");
             b = scanner.nextInt();


             System.out.print("sayilarin bolumu :" + (a/b) );
             break;

         default:
             System.out.println("--*Gecersiz islem*--");
             break;







     }

    }
}
