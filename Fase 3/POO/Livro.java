package POO;

public class Livro {

    String nome;
    String autor;

    public String getNome(){
        return nome;
    }

    public String getAutor(){
        return autor;
    }

    public Livro(String nomeDoLivro, String autorDoLivro){
        this.nome = nomeDoLivro;
        this.autor = autorDoLivro;
    }
}
