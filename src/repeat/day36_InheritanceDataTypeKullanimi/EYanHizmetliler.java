package repeat.day36_InheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yanhizmetliler  : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan hizmetlilerr %30 indirimli issizlik sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe yh1= new EYanHizmetliler();
        // aramaya muhasebe class'idan baslar

        System.out.println(yh1);//  Muhasebeden 8
        System.out.println("yh1.saatUcreti = " + yh1.saatUcreti); // Muhasebeden 10
        yh1.maas(); // 2160 Yanhizmetliler    // maas buldugu icin CTE vermez ancak hemen yazmaz override edilmis mi diye bakar
        yh1.ozelSigorta(); // Muhasebeden       override edildigi icin kendi class'dan alir
        yh1.sigorta();     // APersonel
        System.out.println("yh1.isim = " + yh1.isim); // APersonel
        System.out.println("yh1.soyisim = " + yh1.soyisim); // APersonel
        System.out.println("yh1.departman = " + yh1.departmant); // APersonel

    }

}
