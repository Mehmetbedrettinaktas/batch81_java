package day41_AbstractcCass;

public abstract class DAraba {
    public static void main(String[] args) {
        /*
        Abstract class'da main method opsiyonel'dir
        Eger abstract class  sadece child class#larin
        tasimak zorunda oldugu ozellikleri belirlemek icin
        olusturulduysa main method'a ihtiyac olmaz
         sadece abstract method'lar olur
         Ama bir abstract method'da standart belirlemek disinda' da
         method'lar calisbilir bu durumda ihtiyac oluyorsa
          main method olusturulabilir
         */


    }

    protected  abstract void  yakit();
    protected  abstract void kaporta();
    protected abstract void motor();

    /*
    sadece child classlarin mecburi tasiyacaklari
    ozellikleri belirleyen method'lar abstract method
    olur ve abstract method#larin body'si olmaz.
     */

    public void klima() {
        System.out.println("Bazi arabalrida klima olabilir");

        /*
        Abstract olmayan method'lara  concrete(somut) method denir.
        Abstract bir method#u abstract keyword ile belirtmek ZORUNLUDUR

        concrete method'larda bunun deklare edilmesine gerek yoktur
        biz sadece abstraction ile ilgili konustugumuzda abstract olmayan
        method'lardan bahsetmek icin concrete tabirini kullaniriz.
         */


    }
}
