package POO;

public class BibliotecaApp {
    public static void main(String[] args){
        Livro livro = new  Livro("Senhor dos Aneis", "Tokien");

        System.out.println("O nome do livro é: " + livro.getNome() + ", o seu autor é: " + livro.getAutor()
        );
    }
}
