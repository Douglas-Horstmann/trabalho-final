package _APS;

import java.lang.String;
import java.util.Vector;

class Teste{

    public static void main(String[] args) {
       
       System.out.println("Hello World");

    //    Vector<Sala> salas = new Vector<Sala>();
    //    salas.add(new Sala("103","09:00"));
    //    salas.add(new Sala("105","11:00"));

       Vector<Palestra> palestras = new Vector<Palestra>();
       palestras.add(new Palestra("Palestra1","Descricao1", new Sala("103","09:00")));
       palestras.add(new Palestra("Palestra2","Descricao2", new Sala("103","09:00")));
       palestras.add(new Palestra("Palestra3","Descricao3", new Sala("103","09:00")));
       palestras.add(new Palestra("Palestra4","Descricao4", new Sala("103","09:00")));

       Vector<Palestrante> palestrantes = new Vector<Palestrante>();
       palestrantes.add(new Palestrante("meu_curriculo1", "9999","palestrante1@gmail.com"));
       palestrantes.add(new Palestrante("meu_curriculo2", "8888","palestrante2@gmail.com"));
       palestrantes.add(new Palestrante("meu_curriculo3", "7777","palestrante3@gmail.com"));

       Organizador organizador = new Organizador("Douglas");

       Vector<Participante> participantes = new Vector<Participante>();
       for(int i=0;i<10;i++){
           participantes.add(new Participante("participante"+i, "participante_"+i+"@gmail.com"));
       }

       Evento evento = new Evento(organizador, palestras, participantes, palestrantes);

       evento.ListarPalestras();
    
    }
    
}

