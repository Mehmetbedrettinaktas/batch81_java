package day40_final;

final public class B extends A{

    public static void main(String[] args) {
        /*
        OZET:
        final Variable--> Degeri degistirilemeyecek(constat) variable'lar icin kullanilir,
        mutlaka deger atanmalidir, islmler buyuk harfle yazilmasi tavsiye dilir.

        final Methods --> override edilmeyecek method demektir.

        final classes--> Inherit edilemeyecek class demektir.

        Ek olarak:
        finaly kod blogu:try veya try-catch bloklari ile kullanilir. Try-catch'in sonucu ne olursa olsun calisir.
                        Genellikle database veya cloud ile connection'in sonlandirilmasi, calisan file#in kapanmasi gibi islemler yapar.
        finalize method: garbage colletor kullanilmayan objeleri destray etmeden once kullanilir.
                        calsimasina biz karisamayiz, garbage collector onu kendisi ayarlar.
         */

        B obj = new B();
        obj.isim="Alp";
     //   obj.okul="Java Koleji";

        System.out.println(A.OKUL);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        /*
        bir class final olarak belirlenirse, o class inherit
        edilemez
         */
    }
}
