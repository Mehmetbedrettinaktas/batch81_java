package day07_If_Statements;

import java.util.Scanner;

public class C07_Emekleilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin  65 veya daha buyukseniz emekli olabilirsin
        // 65'ten kucukse emekli olamzsiniz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        }else{
            System.out.println("emekli olamazsin");
            System.out.println(65-yas+ " sene daha calismalisin");
        }
        // if else statement'larda iki durumdan sadece ve sadece biri calsir.
        // ikisinin de birlikte calisma ihtimali ==> YOK.
        // ikisinin de calismama ihtimali ==> YOK

    }
}
