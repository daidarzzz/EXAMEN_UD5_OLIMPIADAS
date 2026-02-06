package org.example;

import java.util.ArrayList;

public class Equipo {

    private String pais;
    private ArrayList<Deportista> listaDeportistas;

    public Equipo(String pais) {
        this.pais = pais;
        listaDeportistas = new ArrayList<>();
    }

    public Equipo() {
        this(null);
    }
    public void inscribirDeportista(Deportista deportista) {

        listaDeportistas.add(deportista);
        deportista.setEquipo(this);

    }

    public int medallasTotales() {

        int numMedallas = 0;

        for (Deportista deportista : listaDeportistas) {
            numMedallas += deportista.getMedallas();
        }
        return numMedallas;

    }

    public void verMedallero() {

        System.out.println("Deportistas que han conseguido medallas para " + pais);
        for (Deportista deportista : listaDeportistas) {

            if (deportista.getMedallas() >= 1) {
                System.out.println("- " + deportista.getNombre() + " con " + deportista.getMedallas() + " medallas.");
            }

        }

    }

    public Deportista deportistaTOP() {

        Deportista mayor = new Deportista("N/D", 31, 12, 2000); //Así en caso de empate siempre se cambiará el mayor
        for (int i = 0; i < listaDeportistas.size(); i++) {

            Deportista deportistaActual = listaDeportistas.get(i);
            if (deportistaActual.getMedallas() > mayor.getMedallas()) mayor = deportistaActual;

        }

        return mayor;

    }

    public void verMedallasDeportista(Deportista deportista) {

        if (!listaDeportistas.contains(deportista)) {

            System.out.println("El deportista " + deportista.getNombre() + " no pertenece al equipo " + pais);

        } else if (deportista.getMedallas() < 1) {
            System.out.println("El deportista " + deportista.getNombre() + " de " + pais + " no ha ganado ninguna medalla durante estos JJOO");
        } else System.out.println("El deportista " + deportista.getNombre() + " de " + pais + " ha ganado " + deportista.getMedallas() + " medallas.");


    }

    public Deportista deportistaMasJoven() {

        Deportista joven = new Deportista("N/D", 10, 1, 2000);

        for (int i = 0; i < listaDeportistas.size(); i++) {
            Deportista deportistaActual = listaDeportistas.get(i);
            if (i == 0) joven = deportistaActual;
            if (deportistaActual.getFecha_nacimiento().isAfter(joven.getFecha_nacimiento())) joven = deportistaActual;
        }

        return joven;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) { //No borro el setPais porque un pais puede cambiar su nombre (aunque sea raro)
        this.pais = pais;
    }

    public ArrayList<Deportista> getListaDeportistas() {
        return listaDeportistas;
    }

    public void setListaDeportistas(ArrayList<Deportista> listaDeportistas) {
        this.listaDeportistas = listaDeportistas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", listaDeportistas=" + listaDeportistas +
                '}';
    }
}




