package day07_If_Statements;

public class C01_If_Statements {
    public static void main(String[] args) {

        int a=2;
        int b=3;

        if (a<b){
            System.out.println(a+b);
        }
        if (a!=b){
            System.out.println(a*b);
        }
        if (a<b){
            System.out.println("Dunya cok guzel olacak");
        }
        if (a*b>5){
            System.out.println("Sayilarin carpimi 5 ten buyuktur");
        }
        /* bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler.
        bir sart ve o sarta bagli sonuca odaklanir
        birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi gibi
        hicbirisinin body'si calismayabilir.
         */
    }
}
