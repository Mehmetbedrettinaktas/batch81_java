package day32_StringBulder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb =new StringBuilder("Java daha ne yapsin");

        sb.append("?"); // StringBuilder'a ekleme yapar
        System.out.println("sb = " + sb); // sb = Java daha ne yapsin?

        // appende istedigimiz Stringi'i en sona ekler

        System.out.println("sb.append(\"Java\",2,4) = " + sb.append("Java", 2, 4));
        //Java daha ne yapsin?va


        // sb.append(5);
       // System.out.println("sb = " + sb); // sb = Java daha ne yapsin?5
//
       // sb.append(true);
       // System.out.println("sb = " + sb); //sb = Java daha ne yapsin?5true

        // araya ekleme yapmak istedigimizde append degil insert kullanmaiyiz
        sb.insert(4, " her seyi dusunmus,");
        System.out.println("sb = " + sb); //sb = Java her seyi dusunmus, daha ne yapsin?

        sb.insert(22,"valla valla",5,11);
        System.out.println("sb = " + sb); // Java her seyi dusunmus valla, daha ne yapsin?



    }
}
