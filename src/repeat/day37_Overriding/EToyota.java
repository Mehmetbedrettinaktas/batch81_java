package repeat.day37_Overriding;

public class EToyota extends DAraba{

    void  marka() {
        System.out.println("Markamiz Toyota");
    }
    @Override
    void motor() {
        System.out.println("Toyota araclar Toyota marka motortalri kullanir");
    }


}
