
import java.util.*;

public class AList {
    public static void main(String[] args) {
        //String tipinde elemanları tutan ArrayList initialize
        List<String> nameList = new java.util.ArrayList<String>();

        //İndis 0'dan başlayarak elemanları sırayla yerleştirir.
        nameList.add("Gamze");
        nameList.add("Elif");
        nameList.add("Mustafa");
        nameList.add("Umut");
        nameList.add("Umut");
        //ArrayList null değerli eleman tutabilir.
        nameList.add(null);

        //Tüm listeyi ekrana yazdırır.
        System.out.println(nameList);

        //size() metodu, Collection Interface'inden gelen bir mirastır.
        System.out.println("Size of list: " + nameList.size());}}
