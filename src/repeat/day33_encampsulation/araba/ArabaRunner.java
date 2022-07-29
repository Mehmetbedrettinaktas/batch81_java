package repeat.day33_encampsulation.araba;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();

        arb1.markaa="Toyota";
        System.out.println(arb1.markaa); // Toyota

        arb1.setModel("Corolla");
        System.out.println("arb1.getYakit() = " + arb1.getYakit()); // Elektririkli

    }
}
