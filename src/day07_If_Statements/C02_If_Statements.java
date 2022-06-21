package day07_If_Statements;

public class C02_If_Statements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a>b &&b<100){
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }
         if (a<0) System.out.println("suslu parantez olmazsa sadece bir satir calisir");

        // bir if cumlesinin daha anlasilir olmasi istiyorsaniz if boda'sini {} icine yazmalisiniz
        // body'yi {} icine yazmazsak da if cumlesi calissir
        // ancak ilk ; kadar gecerlidir alt satir if bagli degil
        System.out.println("2.satir da calisir"); // bu satir if cumlesinden bagimsiz olarak calisir
    }


}
