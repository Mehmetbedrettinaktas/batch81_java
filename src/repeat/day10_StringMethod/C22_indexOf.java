package repeat.day10_StringMethod;

public class C22_indexOf {
    public static void main(String[] args) {

        String str = "java cok kolay, java cok pratik ve java cok guzel";
        String kelime="cok";
        System.out.println(str.indexOf("cok")); // 5

        int ilkCok=str.indexOf("cok");
        int ikinciCok=str.indexOf( "cok", ilkCok+1 );
        System.out.println(str.indexOf( "cok", ilkCok+1 )); // ikinciCok index --> 21

        if (ikinciCok== -1){
            System.out.println("verilen str de 2.ci cok kullanilmamistir");
        }else {
            int ucuncuCok=str.indexOf( "cok"   ,ikinciCok+1);
            if (ucuncuCok==-1){
                System.out.println("verilen str da ucuncuCok yok");
            }else {
                System.out.println("verilen str da ucuncuCok'un index'i : " +ucuncuCok); // 40
            }
        }



    }
}
