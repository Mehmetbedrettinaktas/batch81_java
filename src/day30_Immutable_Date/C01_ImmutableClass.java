package day30_Immutable_Date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list .add("Kenan");
        list.add("Enes");
        list .add("Ismail");
        System.out.println("list = " + list); // list = [Kenan, Enes, Ismail]

        list.set(1,"Yasemin");
        System.out.println("list = " + list); // list = [Kenan, Yasemin, Ismail]

        list.remove(2); // list.remove("Ismail")
        System.out.println("list = " + list); // list = [Kenan, Yasemin]

        list.remove("Kenan");
        System.out.println("list = " + list);


    }
}
