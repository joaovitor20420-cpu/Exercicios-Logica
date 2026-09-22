package Fase4;

public class CartãoDeCredito implements Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("O Usuario realizou pagamento via cartão de Credito nop valor de " + valor);
    }
}
