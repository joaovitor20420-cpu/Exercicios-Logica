package Fase4;

public class LojaAppPagamento {
    public static void main(String[] args) {
        CartãoDeCredito cc = new CartãoDeCredito();
        Pix pix = new Pix();

        cc.realizarPagamento(150);
        pix.realizarPagamento(150);
    }
}
