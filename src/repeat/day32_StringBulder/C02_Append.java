package repeat.day32_StringBulder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java daha ne yapsin");

        System.out.println("sb.append(\"?\") = " + sb.append("?"));
        //sb.append("?") = Java daha ne yapsin?

        // append istedigimiz String'i en sona ekler

        // System.out.println("sb.append(5) = " + sb.append(5)); //sb.append(5) = Java daha ne yapsin?5

        sb.insert(4," her seyi dusunmus,");
        System.out.println("sb = " + sb); //sb = Java her seyi dusunmus, daha ne yapsin?
        // araya ekleme yapmak istedigimizde append degil insert kullanmaiyiz




    }
}
