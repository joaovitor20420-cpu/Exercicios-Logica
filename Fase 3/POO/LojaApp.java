package POO;

public class LojaApp {
    public static void main(String[] args){
        Produto produto = new Produto();

        produto.nome = "Celular";
        produto.preco = 1500;

        produto.AplicarDesconto(10);
    }
}
