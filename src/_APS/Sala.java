package _APS;

public class Sala{

    private String numero;
    private String horario;

    public Sala(String numero, String horario){
        this.numero = numero;
        this.horario = horario;
    }

    public String GetNumero(){
        return this.numero;
    }

    public String GetHorario(){
        return this.horario;
    }

}