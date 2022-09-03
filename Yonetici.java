public class Yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yoneticinin sorumluu oldugu kisi sayisi"+ sorumlu_kisi_sayisi);
    }
    public void zamYap(int zamMiktari){
        System.out.println(getAd()+"calisanlara"+ zamMiktari + "kadar zam yapiyor...");
    }


}


