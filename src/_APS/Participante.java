package _APS;

public class Participante{
    
    private String nome;
    private String email;

    public Participante(){}

    public Participante(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String GetNome(){
        return this.nome;
    }

    public String GetEmail(){
        return this.email;
    }

}