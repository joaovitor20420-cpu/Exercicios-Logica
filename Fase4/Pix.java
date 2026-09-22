package Fase4;

public class Pix implements Pagamento{
    @Override
    public void realizarPagamento(double valor){
        System.out.println("O Usuario realizou paagmento via pix no valor de " + valor);
    }
}
