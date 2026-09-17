package POO;

public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Saldo atualizado: " + saldo);
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo indisponivel para saque!");
        }else{
            saldo = saldo - valor;
            System.out.println("Saque realizado de: " + valor);
            System.out.println("Saldo atualizado: " + saldo);
        }
    }
}
