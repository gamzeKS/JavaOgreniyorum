import java.util.Scanner;

public class GHMak {



        public static int cıkarma(int a, int b) {
            return (a - b);
        }

        public static double bölme(int a, int b) {
            return ((double)a/b );
        }

        public static int toplama(int a, int b) {
            return (a + b);
        }

        public static int toplama(int a, int b, int c) {
            return (a + b + c);

        }

        public static int carpma(int a, int b) {
            return (a * b);
        }

        public static int carpma(int a, int b , int c) {
            return (a * b * c);

        }
        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
            String islemler = "1. Toplama islemi\n"
                    + "2. cikarma islemi \n"
                    + "3. carpma islemi \n"
                    + "4. bolme islemi \n"
                    + "cikis icin q'ya basin";
            System.out.println("***********************");
            System.out.println(islemler);
            System.out.println("************************");


            while (true) {
                System.out.print("islem seciniz:");
                String islem = scanner.nextLine();

                if (islem.equals("q")) {
                    System.out.println("programdan cikiliyor");
                    break;

                } else if (islem.equals("1")) {
                    System.out.print("kac tane deger toplayacaksiniz? 2 veya 3:  ");
                    int kacsayi = scanner.nextInt();
                    if (kacsayi == 2) {
                        {
                            System.out.print("a:");
                            int a = scanner.nextInt();
                            System.out.println("b:");
                            int b = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("girilen sayilarin toplami : " + toplama(a, b));

                        }


                    } else if (kacsayi == 3) {
                        System.out.print("a:");
                        int a = scanner.nextInt();
                        System.out.print("b:");
                        int b = scanner.nextInt();
                        System.out.print("c:");
                        int c = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("girilen sayilarin toplami:  " + toplama(a, b, c));


                    } else {
                        System.out.println("bunun için uygun metot bulunmuyor..");
                    }

                } else if (islem.equals("2")) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.println("girilen sayilain farklari:" + cıkarma(a, b));

                } else if (islem.equals("3")) {
                    System.out.print("kac tane deger carpcaksiniz? 2 veya 3 :");
                    int kacsayi = scanner.nextInt();
                    if (kacsayi == 2) {
                        {
                            System.out.print("a:");
                            int a = scanner.nextInt();
                            System.out.print("b:");
                            int b = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("girilen sayilarin carpimi:  " + carpma(a, b));


                        }


                    } else if (kacsayi==3) {
                        System.out.print("a:");
                        int a = scanner.nextInt();
                        System.out.print("b:");
                        int b = scanner.nextInt();
                        System.out.print("c:");
                        int c = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("girilen sayilarin carpimi:  "+ carpma(a,b,c));

                    }

                } else if (islem.equals("4")) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.println("girilen sayilarin bolumu:" + bölme(a, b));


                }
                else {
                    System.out.println("gecersiz islem");
                }


            }

        }}

