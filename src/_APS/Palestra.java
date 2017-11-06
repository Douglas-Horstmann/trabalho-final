package _APS;

public class Palestra{

    private String titulo;
    private String resumo;
    private Sala sala = null;

    public Palestra(){};

    public Palestra(String titulo, String resumo, Sala sala){
        this.titulo = titulo;
        this.resumo = resumo;
        this.sala = sala;
    }

    public String GetTitulo(){
        return this.titulo;
    }

    public String GetResumo(){
        return this.resumo;
    }

    public String GetSalaNumero(){
       return this.sala.GetNumero();
    }

    public String GetSalaHorario(){
        return this.sala.GetHorario();
    }

}