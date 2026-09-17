package POO;

public class Produto {
    String nome;
    double preco;


    public void AplicarDesconto(double porcentagem){
        double desconto = preco * porcentagem / 100;
        preco = preco - desconto;

        System.out.println("O valor com desconto aplicado é: " + preco);
    }
}
