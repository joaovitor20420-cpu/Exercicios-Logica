package Fase5;

public class Conta {
    double saldo = 100.0;

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException("O saque não pode ser realizado");
        }else{
            saldo = saldo - valor;
            System.out.println("O saque de " + valor + " foi realizado com sucesso!!");
            System.out.println("Saldo atual: " + saldo);
        }
    }
}
