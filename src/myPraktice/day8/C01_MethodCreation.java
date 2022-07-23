package myPraktice.day8;

public class C01_MethodCreation {
    public static void main(String[] args) {

         /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaaeee"
        output: abcde
     */

        String str ="aabb cccccdd ddaaaeee";

        birkezYazdir(str);

    }

    private static void birkezYazdir(String str) {


        String output="";
        for (int i = 0; i <str.length() ; i++) {
            if (!output.contains(str.substring(i,i+1))){
                // tekrarsiz karekterleri dondurecegimiz icin sonucumuz str den
                // aldigimiz herhangi bir karekteri icermesin

                output += str.substring(i,i+1); // o zaman sonuca eklesin



            }

        }
        System.out.println(output);

    }

}
