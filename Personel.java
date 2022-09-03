import java.util.Scanner;

public class Personel {
    public static void main (String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("calisanlar programina hosgeldiniz...");
        String islemler = "Islemler...\n"
        + "1.  Yazilimci İslemleri\n"
        + "2.  Yonetici Islemleri\n"
        + "Cikis icin q'ya basin";
        System.out.println("*********************************");
        System.out.println(islemler);
        System.out.println("*********************************");

        while (true){
            System.out.print("Islemi Seciniz:  ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor..");
                break;
            } else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Gamze","Sarı",1106,"Java");
                String yazilimci_islem = "1. Format at\n"
                        + "2. Bilgileri göster\n"
                        + " Cikis icin q'ya basin..";
                System.out.println(yazilimci_islem);

                while (true){
                    System.out.println("Islemi seciniz....: ");
                    String y_islem = scanner.nextLine();

                    if (islem.equals("q")){
                        System.out.println("Yazilimci islemlerinden cikiliyor..");
                        break;
                    } else if (islem.equals("1")) {
                        System.out.println("isletim sistemi:");
                        String isletim_sistemi= scanner.nextLine();
                        yazilimci.fotmatAt(isletim_sistemi);
                    } else if (islem.equals("2")) {
                        yazilimci.bilgileriGoster();

                    }
                    else {
                        System.out.println("gecersiz yazilimci islemi...");
                    }


                }

            } else if (islem.equals("2")) {
                Yonetici yonetici= new Yonetici("Ali","Sarı",0204,3);
                String yonetici_islem= "Yonetici islemleri:\n" +
                        "1. zam yap\n" +
                        "2. bilgileri goster\n" +
                        "Cikis icin q'ya basınız..";
                System.out.println(yonetici_islem);
                while (true){
                    System.out.println("islem seciniz:");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("yonetici islemlerinden cikiliyor..");
                    } else if (y_islem.equals("1")) {
                        System.out.println("ne kadar zam istiyorsunuz ? : ");
                            int zamMiktari = scanner.nextInt();
                            scanner.nextLine();
                            yonetici.zamYap(zamMiktari);




                    } else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();


                        
                    }
                    else {
                        System.out.println("gecersiz yonetici islemi...");
                    }


                }

                
            }
            else {
                System.out.println("..Gecersiz islem..");
            }



        }





}}
