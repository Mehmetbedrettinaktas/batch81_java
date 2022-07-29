package day26_constructor;

public class C01 {
    public static class C11_ConstructorCarrunner {
        public static void main(String[] args) {


            //   C10_ConstructorCar obje olusturulacak class'in adi
            //car1 obje'nin adi
            // new yeni bir obje olusturmak icin kullanilan keyword
            //C10_ConstructorCar(); constructor 'dir

            //new  C10_ConstructorCar(). tum ozelliklerini de bu sekilde kullanabiliriz

            C10_ConstructorCar car1=new C10_ConstructorCar(2022, "Turuncu");






        }
    }

    public static class C10_ConstructorCar {

        public C10_ConstructorCar(){

            System.out.println("parametresiz cons");
        }

        public  C10_ConstructorCar(String renk){
            System.out.println(renk+" araba uretildi");
        }
        public  C10_ConstructorCar(int yil){
            System.out.println(yil+" araba uretildi");
        }
        public  C10_ConstructorCar(int yil, String renk){
            System.out.println(yil+ " model "+renk+ " renkte araba uretildi");

        }
    }
}


