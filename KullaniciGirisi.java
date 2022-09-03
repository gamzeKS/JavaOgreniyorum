import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        int giris_hakkı = 3;

        String sys_kullanici_adi = "Gamze Sari";
        String sys_parola = "gamzek";

        System.out.println("***************************************");
        System.out.println("Kullanici Giris Sayfasina Hosgeldinizzz...");
        System.out.println("***************************************");

        while (true) {
            System.out.print("kullanici adi:  ");
            String kullanıcı = scanner.nextLine();
            System.out.print("parola:    ");
            String parola = scanner.nextLine();

            if (kullanıcı.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hosgeldinizzz" + kullanıcı);
                break;
            } else if (kullanıcı.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("hatali sifre");
                giris_hakkı -= 1;


            } else if (!kullanıcı.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("hatali kullanici adi");
                giris_hakkı -= 1;


            } else {
                System.out.println("kullanici adi ve parola hatali..");
                giris_hakkı-=1;



            }
            if (giris_hakkı==0){
                System.out.println("hatali giris hakkınız dolmustur ");


            }

        }
    }}