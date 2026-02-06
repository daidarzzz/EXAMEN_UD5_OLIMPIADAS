package org.example;

public class JuegosInviernoApp {

    static void main(String[] args) {

//        Deportista manuel = new Deportista("Manu", 10, 8, 2007);
//        Deportista joaquin = new Deportista("Joa", 10, 10, 2010);
//        Deportista juan = new Deportista("Juan", 10, 2, 2003);
//        Deportista aa = new Deportista("AAA", 10, 2, 2003);
//
//        manuel.inscribirse("Hockey");
//        manuel.inscribirse("Furbo");
//
//        System.out.println(manuel);
//
//        manuel.verModalidades();
//
//        Equipo españa = new Equipo("España");
//        españa.inscribirDeportista(joaquin);
//        Equipo francia = new Equipo();
//        españa.inscribirDeportista(manuel);
//
//        manuel.setMedallas(5);
//        juan.inscribirse("Pedro");
//        españa.inscribirDeportista(juan);
//        juan.setMedallas(12);
//        System.out.println(españa);
//        System.out.println(manuel);
//        System.out.println(francia);
//        aa.setMedallas(12);
//        System.out.println(españa.medallasTotales());
//        españa.inscribirDeportista(aa);
//        españa.verMedallero();
//
//        System.out.println(españa.deportistaTOP());

        Deportista olivia_smart = new Deportista("Olivia Smart",1,4,1997);
        olivia_smart.inscribirse("Patinaje artístico");
        Deportista nil_llop = new Deportista("Nil Llop",20,9,2002);
        nil_llop.inscribirse("Patinaje velocidad");
        Deportista nora_cornell = new Deportista("Nora Cornell", 2,9,2005);
        nora_cornell.inscribirse("Snowboard");
        nora_cornell.inscribirse("Big Air");
        Equipo espanya = new Equipo("ESPAÑA");
        espanya.inscribirDeportista(olivia_smart);
        espanya.inscribirDeportista(nora_cornell);
        espanya.inscribirDeportista(nil_llop);
        System.out.println(espanya);
        nora_cornell.setMedallas(2);
        nil_llop.setMedallas(1);
        //a)
        nora_cornell.verModalidades();
        //b)
        System.out.println("\n" + espanya.getPais() + " ha conseguido " + espanya.medallasTotales() + " medallas.");;
        //c)
        espanya.verMedallero();
        //d)
        System.out.println("\nEl deportista de " + espanya.getPais() + " que más medallas ha ganado es " + espanya.deportistaTOP().getNombre());
        //e)
        espanya.verMedallasDeportista(olivia_smart);
        espanya.verMedallasDeportista(nil_llop);
        Deportista deportista_sin_equipo = new
        Deportista("Prueba",1,1,2000);
        espanya.verMedallasDeportista(deportista_sin_equipo);
        //f)
        System.out.println("\n El deportista más joven de " +
        espanya.getPais() + " es " + espanya.deportistaMasJoven().getNombre());
    }

}



