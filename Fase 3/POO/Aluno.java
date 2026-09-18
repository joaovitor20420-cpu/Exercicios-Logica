package POO;

public class Aluno {
    private String nome;
    private double nota;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota < 0 || nota > 10){
            System.out.println("ERRO: não é possivel registrar essa nota!");
        }else {
            this.nota = nota;
            System.out.println("Nota atualizada com sucesso: " + getNota());
        }
    }
}
