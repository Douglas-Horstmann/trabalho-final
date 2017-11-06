package _APS;

import java.time.LocalDate;
import java.util.Vector;

public class Evento{

    private LocalDate dataEvento = null;
    private Vector<Palestra> lstPalestras = null;
    private Vector<Participante> lstParticipantes = null;
    private Vector<Palestrante> lstPalestrantes = null;
    private Organizador organizador = null;

    public Evento(Organizador organizador, 
                  Vector<Palestra> lstPalestras,
                  Vector<Participante> lstParticipantes,
                  Vector<Palestrante> lstPalestrantes)
    {
        this.organizador = organizador;
        this.lstPalestras = lstPalestras;
        this.lstParticipantes = lstParticipantes;
        this.lstPalestrantes = lstPalestrantes;
    }

    public void ListarPalestras(){
        for(Palestra palestra:lstPalestras){
            System.out.println("Titulo: " + palestra.GetTitulo());
            System.out.println("Resumo: " + palestra.GetResumo());
            System.out.println("Sala numero: " + palestra.GetSalaNumero());
            System.out.println("Horário: " + palestra.GetSalaHorario());
        }
    }

}