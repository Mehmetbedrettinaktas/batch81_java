package day32_StringBulder;

public class C05_indexOf_LastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Pay attention please"); // dikkat edin lutfen

        System.out.println("sb.indexOf(\"Pay\") = " + sb.indexOf("Pay"));// 0 ci index
        // indexof ile Stringimizin icerisinde aradigimiz Stringin
        // index numarasini bize dondurur, eger yoksa indexOf 0 dondurur,
        // varsa index numarasini bize dondurur. Ve Stringimizi degistirmez

        System.out.println("sb = " + sb); // Pay attention please

        System.out.println("sb.indexOf(\"e\") = " + sb.indexOf("e")); // 7

        System.out.println("sb.indexOf(\"e\",10) = " + sb.indexOf("e",10));// 16

        /*
        indexOf aramayi bastan baslar ve index numarasini bize
        bastan itibaren  dondurur, lastIndexOf ise aramayi sondan baslar fakat
        index'i bastan baslayarak veririr
         */


        System.out.println("sb.lastIndexOf(\"e\") = " + sb.lastIndexOf("e")); // 19
        // aramayi sondan baslar ve ilk buldugu e indexini bastan verir

        
        System.out.println(sb.lastIndexOf("e",10));// 7

        System.out.println("sb.lastIndexOf(\"e\",10) = " + sb.lastIndexOf("e",10)); // 7

    }
}
